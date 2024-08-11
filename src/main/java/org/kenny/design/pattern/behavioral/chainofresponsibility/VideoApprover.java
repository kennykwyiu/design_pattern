package org.kenny.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + " finished video, approve!!!");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + " don't have video, CANNOT approve!!!");
        }
    }
}
