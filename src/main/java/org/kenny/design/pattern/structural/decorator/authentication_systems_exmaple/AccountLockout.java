package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountLockout {
    private static final int MAX_FAILED_ATTEMPTS = 3;
    private static final long LOCKOUT_DURATION_MS = 60000; // 1 minute lockout duration
    private static Map<String, Integer> failedLoginAttempts = new HashMap<>();
    private static Map<String, Long> lockedUsers = new HashMap<>();
    private static Map<String, List<Long>> failedLoginLogs = new HashMap<>();

    public static boolean isAccountLocked(String username) {
        Long lockTime = lockedUsers.get(username);
        if (lockTime != null && System.currentTimeMillis() - lockTime < LOCKOUT_DURATION_MS) {
            return true;
        }
        return false;
    }

    public static void handleFailedLoginAttempt(String username) {
        int failedAttempts = failedLoginAttempts.getOrDefault(username, 0) + 1;
        failedLoginAttempts.put(username, failedAttempts);

        List<Long> logList = failedLoginLogs.getOrDefault(username, new ArrayList<>());
        logList.add(System.currentTimeMillis());
        failedLoginLogs.put(username, logList);

        if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
            lockedUsers.put(username, System.currentTimeMillis());
        }
    }

    public static void resetFailedLoginAttempts(String username) {
        failedLoginAttempts.remove(username);
        lockedUsers.remove(username);
        failedLoginLogs.remove(username);
    }

    public static void sendLockoutNotification(String username) {
        // Code to send email notification to the user
        System.out.println("Email notification sent to " + username + ": Your account has been locked due to multiple failed login attempts.");
    }

    public static void sendPasswordResetLink(String username) {
        // Generate a password reset link and send it to the user via email
        String resetLink = generatePasswordResetLink(username);
        System.out.println("Password reset link sent to " + username + ": " + resetLink);
    }

    private static String generatePasswordResetLink(String username) {
        // Generate a unique password reset link for the user
        // This link can contain a token or a unique identifier to identify the user
        return "https://example.com/reset-password?user=" + username;
    }

    public static Map<String, List<Long>> getFailedLoginLogs() {
        return failedLoginLogs;
    }

}
