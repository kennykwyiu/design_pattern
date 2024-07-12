package org.kenny.design.pattern.behavioral.templatemethod;

public class WebDevelopmentCourse extends ACourse{
    @Override
    void packageCourse() {
        System.out.println("provide the front end JS source code");
        System.out.println("provide the photo or icon in the website");
    }
}
