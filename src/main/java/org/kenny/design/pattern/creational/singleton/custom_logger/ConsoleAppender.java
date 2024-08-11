package org.kenny.design.pattern.creational.singleton.custom_logger;

public class ConsoleAppender implements Appender {
    @Override
    public void append(LogLevel level, String message) {
        System.out.println("[" + level + "] " + message);
    }
}
