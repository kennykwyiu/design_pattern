package org.kenny.design.pattern.behavioral.templatemethod.frameworkexample;

/**
 * In this example, WebFramework acts as the abstract class defining the template method handleRequest() that outlines
 * the steps involved in handling a web request. Subclasses SpringFramework and DjangoFramework extend WebFramework and
 * provide their own implementations for preprocessing the request, routing the request, and rendering the response.
 *
 * When you run the WebFrameworkExample class, you'll see the output demonstrating how the Spring and Django frameworks
 * handle a web request by following the template method defined in the WebFramework class.
 */

public class WebFrameworkExample {
    public static void main(String[] args) {

        WebFramework spring = new SpringFramework();
        System.out.println("Handling request using Spring framework:");
        spring.handleRequest();
        System.out.println();

        WebFramework django = new DjangoFramework();
        System.out.println("Handling request using Django framework:");
        django.handleRequest();
    }
}
