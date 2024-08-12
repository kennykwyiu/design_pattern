package org.kenny.design.pattern.creational.singleton.custom_logger_enum;


public interface Appender {
    void append(LogLevel level, String message);
}
