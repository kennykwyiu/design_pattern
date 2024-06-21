package org.kenny.design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaScriptVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }
}
