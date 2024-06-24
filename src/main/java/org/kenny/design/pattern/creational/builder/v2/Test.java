package org.kenny.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java - design pattern")
                .buildCoursePpt("Java - design pattern PPT")
                .buildCourseVideo("Java - design pattern video")
                .build();
        System.out.println(course);
    }
}
