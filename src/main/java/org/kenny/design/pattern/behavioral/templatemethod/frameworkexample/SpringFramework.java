package org.kenny.design.pattern.behavioral.templatemethod.frameworkexample;

public class SpringFramework extends WebFramework {

    @Override
    void preprocessRequest() {
        System.out.println("Spring: Preprocessing the request");
    }

    @Override
    void routeRequest() {
        System.out.println("Spring: Routing the request");
    }

    @Override
    void renderResponse() {
        System.out.println("Spring: Rendering the response");
    }
}
