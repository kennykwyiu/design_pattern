package org.kenny.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void subscribe(String str) {
        System.out.println("execute subscribe method, passed in params: " + str);
    }
}
