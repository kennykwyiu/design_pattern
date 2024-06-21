package org.kenny.design.pattern.creational.simplefactory;

public class VideoFactory {

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return video;
    }

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
