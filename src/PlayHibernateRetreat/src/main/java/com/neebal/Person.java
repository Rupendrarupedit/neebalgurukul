package com.neebal;

import javax.persistence.*;

@MappedSuperclass
//@Entity
//@Table(name = "people")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    protected String studName;

    @Column(nullable = false)
    protected Character gender;

    public  Person(){}

    public Person(String studName, Character gender) {
        this.studName = studName;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", studName='" + studName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
