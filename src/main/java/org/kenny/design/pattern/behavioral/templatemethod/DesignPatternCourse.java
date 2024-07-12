package org.kenny.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse{
    @Override
    void packageCourse() {
        System.out.println("provide the source code of Java course");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
