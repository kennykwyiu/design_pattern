package org.kenny.design.pattern.creational.singleton.logger_singleton_example;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("This is an informational message.");
        logger.error("An error occurred while processing the request.");
    }
}
