package org.kenny.design.pattern.behavioral.state;

public class StopState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR: cannot speed the course video in stop state");
    }

    @Override
    public void pause() {
        System.out.println("ERROR: cannot pause the course video in stop state");
    }

    @Override
    public void stop() {
        System.out.println("state: stop the course video");
    }
}
