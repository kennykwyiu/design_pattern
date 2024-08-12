package org.kenny.design.pattern.creational.singleton.custom_logger_enum;

import java.util.ArrayList;
import java.util.List;

public enum CustomLoggerEnum {
    INSTANCE;

    private List<Appender> appenders;

    CustomLoggerEnum() {
        appenders = new ArrayList<>();
    }

    public void addAppender(Appender appender) {
        synchronized (appenders) {
            appenders.add(appender);
        }
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    private void log(LogLevel level, String message) {
        synchronized (appenders) {
            for (Appender appender : appenders) {
                appender.append(level, message);
            }
        }
    }
}
