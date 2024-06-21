package org.kenny.design.pattern.creational.factorymethod;

public class JavaScriptVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaScriptVideo();
    }
}
