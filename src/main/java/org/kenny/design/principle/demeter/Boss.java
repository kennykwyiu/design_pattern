package org.kenny.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {

        teamLeader.checkNumberOfCourses();
    }
}
