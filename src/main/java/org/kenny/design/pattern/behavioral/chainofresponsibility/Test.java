package org.kenny.design.pattern.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java Design Pattern - By Kenny");
        course.setArticle("Java Design Pattern Article");
//        course.setVideo("Java Design Pattern Video");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
