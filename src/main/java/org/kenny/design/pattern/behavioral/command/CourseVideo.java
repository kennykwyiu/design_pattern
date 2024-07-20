package org.kenny.design.pattern.behavioral.command;

public class CourseVideo {
    private String name;
    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + " course video is opened for all people");
    }

    public void close() {
        System.out.println(this.name + " course video is closed");
    }
}
