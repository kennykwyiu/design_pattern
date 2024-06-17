package org.kenny.design.principle.dependenceinversion;

public class FrontEndCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Kenny is studying FrontEnd course");
    }
}
