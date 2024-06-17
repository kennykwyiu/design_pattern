package org.kenny.design.principle.dependenceinversion;

public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Kenny is studying Java course");
    }
}
