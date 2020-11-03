package com.theCeShop.theCeShop.model;


import javax.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue
    private Long id;
    private String questionName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }



}
