package org.kenny.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("the qty of online courses are " + courseList.size());
    }

}
