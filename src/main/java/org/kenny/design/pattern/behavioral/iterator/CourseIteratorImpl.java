package org.kenny.design.pattern.behavioral.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator{
    private List courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("return course, address is: " + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
