package org.kenny.design.pattern.behavioral.iterator;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java e-commerce ep.1");
        Course course2 = new Course("Java e-commerce ep.2");
        Course course3 = new Course("Java Design Pattern");
        Course course4 = new Course("Python Course");
        Course course5 = new Course("Algo Course");
        Course course6 = new Course("Front-ENd Course");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("---course outline---");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----course outline after delete operation");
        printCourses(courseAggregate);
    }

    public static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }

    }
}
