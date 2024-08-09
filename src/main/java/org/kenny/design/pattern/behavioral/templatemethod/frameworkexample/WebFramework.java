package org.kenny.design.pattern.behavioral.templatemethod.frameworkexample;

public abstract class WebFramework {

    // Template method defining the request handling algorithm
    public final void handleRequest() {
        preprocessRequest();
        routeRequest();
        renderResponse();
    }

    // Methods to be implemented by subclasses
    abstract void preprocessRequest();
    abstract void routeRequest();
    abstract void renderResponse();
}
