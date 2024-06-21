package org.kenny.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();
    }
}
