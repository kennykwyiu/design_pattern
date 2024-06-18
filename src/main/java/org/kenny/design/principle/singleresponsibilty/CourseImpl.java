package org.kenny.design.principle.singleresponsibilty;

public class CourseImpl implements  ICourseManager, ICourseContent {
    @Override
    public String getCourseName() {
        return "";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
