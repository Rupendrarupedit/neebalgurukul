package com.neebal;

import com.neebal.entities.Question;
import com.neebal.entities.Question_Option;
import com.neebal.entities.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class CreateTopic {
    public static void main(String[] args) {

        Question question1 = new Question("How many total bones are there in human skull?",2);

        Question_Option opt1 = new Question_Option("A. 20",false);
        Question_Option opt2 = new Question_Option("B. 21",false);
        Question_Option opt3 = new Question_Option("C. 22",true);
        Question_Option opt4 = new Question_Option("D. 23",false);

        Topic topic = new Topic("Topic2");

        opt1.setQuestion(question1);
        opt2.setQuestion(question1);
        opt3.setQuestion(question1);
        opt4.setQuestion(question1);

        Set<Question_Option> questionOptionSet = new HashSet<>();
        questionOptionSet.add(opt1);
        questionOptionSet.add(opt2);
        questionOptionSet.add(opt3);
        questionOptionSet.add(opt4);
        question1.setQuestion_optionSet(questionOptionSet);

        question1.setTopic(topic);

        Set<Question> questionSet = new HashSet<>();
        questionSet.add(question1);
        topic.setQuestionSet(questionSet);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(topic);
            transaction.commit();
        }
    }
}
