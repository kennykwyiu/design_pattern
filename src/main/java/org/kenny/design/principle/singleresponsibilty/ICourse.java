package org.kenny.design.principle.singleresponsibilty;

public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
