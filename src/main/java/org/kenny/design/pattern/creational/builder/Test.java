package org.kenny.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Tutor tutor = new Tutor();
        tutor.setCourseBuilder(courseBuilder);

        Course course = tutor.makeCourse("Java - design pattern",
                                        "Java - design pattern PPT",
                                        "Java - design pattern video",
                                        "Java - design pattern article",
                                        "Java - design pattern Q&A");
        System.out.println(course);
    }
}
