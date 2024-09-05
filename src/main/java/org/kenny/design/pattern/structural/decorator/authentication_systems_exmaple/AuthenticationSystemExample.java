package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

import java.util.List;
import java.util.Map;

public class AuthenticationSystemExample {
    public static void main(String[] args) {
        // Basic authentication
        Authentication basicAuthentication = new BasicAuthentication();
        System.out.println("Basic Authentication Result: " + basicAuthentication.authenticate("admin", "admin123"));

        // Two-factor authentication
        TwoFactorAuthenticationDecorator twoFactorAuthentication = new TwoFactorAuthenticationDecorator(new BasicAuthentication());
        System.out.println("Two-Factor Authentication Result: " + twoFactorAuthentication.authenticate("admin", "admin123"));

        RoleBasedAccessControlDecorator roleBasedAuthentication = new RoleBasedAccessControlDecorator(new BasicAuthentication());
        System.out.println("Role-Based Authentication Result: " + roleBasedAuthentication.authenticate("admin", "admin123"));

        String username = "admin";
        String password = "admin123";
        String token = "123456";

        boolean isAuthenticated = twoFactorAuthentication.authenticate(username, password, token);

        if (isAuthenticated) {
            System.out.println("Two-Factor Authentication Successful for User: " + username);
        } else {
            System.out.println("Two-Factor Authentication Failed for User: " + username);
        }

        Role adminRole = new Role("admin");
        Role userRole = new Role("user");
        roleBasedAuthentication.addRole(adminRole);
        roleBasedAuthentication.addRole(userRole);

        User adminUser = new User("admin", "admin123", "admin");
        User regularUser = new User("user1", "user123", "user");

        System.out.println("Admin Access: " + roleBasedAuthentication.checkAccess(adminUser, "adminResource"));
        System.out.println("Regular User Access: " + roleBasedAuthentication.checkAccess(regularUser, "adminResource"));

        String usernameWrong = "user1";
        String passwordWrong = "wrongpass";
        String tokenWrong = "123456";

        // Simulate 4 failed login attempts
        for (int i = 0; i < 4; i++) {
            twoFactorAuthentication.authenticate(usernameWrong, passwordWrong, tokenWrong);
        }

        // Retrieve and print the failed login logs
        Map<String, List<Long>> failedLoginLogs = AccountLockout.getFailedLoginLogs();
        for (Map.Entry<String, List<Long>> entry : failedLoginLogs.entrySet()) {
            System.out.println("Failed login attempts for user " + entry.getKey() + ": " + entry.getValue());
        }

        // Check if the account is still locked after the lockout duration
        boolean isAccountLocked = AccountLockout.isAccountLocked(username);
        System.out.println("Is account locked for user5 after lockout duration? " + isAccountLocked);

    }

}
