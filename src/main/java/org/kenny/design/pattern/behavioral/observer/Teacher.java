package org.kenny.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }


    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + " teacher's" + course.getCourseName() + " got a question from " + question.getUserName() + "! Question: " + question.getQuestionContent());
    }
}
