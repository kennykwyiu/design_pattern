package org.kenny.design.pattern.behavioral.templatemethod;

public abstract class ACourse {
    protected final void makeCourse() {

    }

    final void makePPT() {
        System.out.println("make PPT");
    }

    final void makeVideo() {
        System.out.println("make video");
    }

    final void writeArticle() {
        System.out.println("write article");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
