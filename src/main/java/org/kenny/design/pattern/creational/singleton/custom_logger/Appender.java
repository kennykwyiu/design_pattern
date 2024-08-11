package org.kenny.design.pattern.creational.singleton.custom_logger;

public interface Appender {
    void append(LogLevel level, String message);
}
