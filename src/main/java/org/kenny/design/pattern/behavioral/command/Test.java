package org.kenny.design.pattern.behavioral.command;

public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java Design Pattern -- By Kenny");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }
}
