package org.kenny.design.pattern.creational.builder.v2;

import org.kenny.design.pattern.creational.builder.CourseBuilder;

public class Course {

    private String courseName;
    private String coursePpt;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePpt='" + coursePpt + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }


}
