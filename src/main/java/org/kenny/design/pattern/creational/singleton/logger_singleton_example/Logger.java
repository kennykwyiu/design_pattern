package org.kenny.design.pattern.creational.singleton.logger_singleton_example;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String message) {
        log("[INFO] " + message);
    }

    public void error(String message) {
        log("[ERROR] " + message);
    }

    private void log(String message) {
        System.out.println(message);
        // Additional log handling logic
    }
}
