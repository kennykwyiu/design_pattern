package org.kenny.design.pattern.creational.singleton.custom_logger;

import java.util.ArrayList;
import java.util.List;

public class CustomLogger {
    private static volatile  CustomLogger instance;
    private List<Appender> appenders;

    private CustomLogger() {
        appenders = new ArrayList<>();
    }

    public static CustomLogger getInstance() {
        if (instance == null) {
            synchronized (CustomLogger.class) {
                if (instance == null) {
                    instance = new CustomLogger();
                }
            }
        }
        return instance;
    }

    public void addAppender(Appender appender) {
        synchronized (appender) {
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

