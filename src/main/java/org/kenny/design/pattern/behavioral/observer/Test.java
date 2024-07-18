package org.kenny.design.pattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java Design Patter");
        Teacher teacher1 = new Teacher("Peter");
        Teacher teacher2 = new Teacher("John");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("Kenny");
        question.setQuestionContent("How to write the main function in Java?");

        course.produceQuestion(course,question);

    }
}
