package org.kenny.design.principle.dependenceinversion;

public class Kenny {
//    public void studyJavaCourse() {
//        System.out.println("Kenny is studying Java course");
//    }
//    public void studyFrontEndCourse() {
//        System.out.println("Kenny is studying FrontEnd course");
//    }
//    public void studyPythonCourse() {
//        System.out.println("Kenny is studying Python course");
//    }
    private ICourse iCourse;

    public Kenny(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyUdemyCourse() {
        iCourse.studyCourse();
    }


}
