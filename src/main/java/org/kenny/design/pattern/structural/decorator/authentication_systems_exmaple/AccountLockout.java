package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

import java.util.HashMap;
import java.util.Map;

public class AccountLockout {
    private static final int MAX_FAILED_ATTEMPTS = 3;
    private static final long LOCKOUT_DURATION_MS = 60000; // 1 minute lockout duration
    private static Map<String, Integer> failedLoginAttempts = new HashMap<>();
    private static Map<String, Long> lockedUsers = new HashMap<>();

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

        if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
            lockedUsers.put(username, System.currentTimeMillis());
        }
    }

    public static void resetFailedLoginAttempts(String username) {
        failedLoginAttempts.remove(username);
        lockedUsers.remove(username);
    }

    public static void sendLockoutNotification(String username) {
        // Code to send email notification to the user
        System.out.println("Email notification sent to " + username + ": Your account has been locked due to multiple failed login attempts.");
    }

}
