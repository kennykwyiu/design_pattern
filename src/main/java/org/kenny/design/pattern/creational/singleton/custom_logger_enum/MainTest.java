package org.kenny.design.pattern.creational.singleton.custom_logger_enum;

public class MainTest {
    public static void main(String[] args) {
        CustomLoggerEnum.INSTANCE.addAppender(new ConsoleAppender());

        // Log messages
        CustomLoggerEnum.INSTANCE.info("This is an informational message.");
        CustomLoggerEnum.INSTANCE.error("An error occurred.");
    }
}
