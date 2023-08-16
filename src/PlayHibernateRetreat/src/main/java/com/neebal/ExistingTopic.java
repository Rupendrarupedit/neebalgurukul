package com.neebal;

import com.neebal.entities.PublicationHouse;
import com.neebal.entities.Question;
import com.neebal.entities.Question_Option;
import com.neebal.entities.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class ExistingTopic {
    public static void main(String[] args) {

        Question_Option opt1 = new Question_Option("A. Brazil",false);
        Question_Option opt2 = new Question_Option("B. Portugal",false);
        Question_Option opt3 = new Question_Option("C. France",false);
        Question_Option opt4 = new Question_Option("D. Argentina",true);

        Question question = new Question("Who won the FIFA World Cup in 2022?",2);

        opt1.setQuestion(question);
        opt2.setQuestion(question);
        opt3.setQuestion(question);
        opt4.setQuestion(question);

        Set<Question_Option> questionOptionSet = new HashSet<>();
        questionOptionSet.add(opt1);
        questionOptionSet.add(opt2);
        questionOptionSet.add(opt3);
        questionOptionSet.add(opt4);
        question.setQuestion_optionSet(questionOptionSet);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            Topic topic = session.get(Topic.class,1l);
            Transaction transaction = session.beginTransaction();
            question.setTopic(topic);
            session.save(question);
            transaction.commit();
        }
    }
}
