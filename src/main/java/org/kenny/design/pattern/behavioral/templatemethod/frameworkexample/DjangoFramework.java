package org.kenny.design.pattern.behavioral.templatemethod.frameworkexample;

public class DjangoFramework extends WebFramework {

    @Override
    void preprocessRequest() {
        System.out.println("Django: Preprocessing the request");
    }

    @Override
    void routeRequest() {
        System.out.println("Django: Routing the request");
    }

    @Override
    void renderResponse() {
        System.out.println("Django: Rendering the response");
    }
}
