package org.kenny.design.pattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(String type) {
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("python".equals(type)) {
            return new PythonVideo();
        } else if ("javascript".equals(type)) {
            return new JavaScriptVideo();
        }
        return null;
    }
}
