package org.kenny.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Kenny kenny = new Kenny();
//        kenny.studyJavaCourse();
//        kenny.studyFrontEndCourse();
        kenny.studyUdemyCourse(new JavaCourse());
        kenny.studyUdemyCourse(new FrontEndCourse());
    }
}
