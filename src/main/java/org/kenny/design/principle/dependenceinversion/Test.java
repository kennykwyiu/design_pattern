package org.kenny.design.principle.dependenceinversion;

public class Test {
    // v1 and v2
//    public static void main(String[] args) {
//        Kenny kenny = new Kenny();
////        kenny.studyJavaCourse();
////        kenny.studyFrontEndCourse();
//        kenny.studyUdemyCourse(new JavaCourse());
//        kenny.studyUdemyCourse(new FrontEndCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Kenny kenny = new Kenny(new JavaCourse());
//        kenny.studyUdemyCourse();
//    }

    public static void main(String[] args) {
        Kenny kenny = new Kenny();
        kenny.setiCourse(new JavaCourse());
        kenny.studyUdemyCourse();
        kenny.setiCourse(new FrontEndCourse());
        kenny.studyUdemyCourse();
    }


}
