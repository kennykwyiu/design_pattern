package org.kenny.design.pattern.creational.singleton.custom_logger;

public class MainTest {
    public static void main(String[] args) {
        CustomLogger logger = CustomLogger.getInstance();

        // Add appenders to the logger
        logger.addAppender(new ConsoleAppender());

        // Log messages
        logger.info("This is an informational message.");
        logger.error("An error occurred.");
    }
}
