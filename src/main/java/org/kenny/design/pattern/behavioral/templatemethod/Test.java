package org.kenny.design.pattern.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- backend design pattern course - [start] ---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("--- backend design pattern course - [end] ---");

        System.out.println("--- front-end web development course - [start] ---");
        ACourse webDevelopmentCourse = new WebDevelopmentCourse(false);
        webDevelopmentCourse.makeCourse();
        System.out.println("--- front-end web development course - [end] ---");
    }
}
