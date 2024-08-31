package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

public class AuthenticationSystemExample {
    public static void main(String[] args) {
        // Basic authentication
        Authentication basicAuthentication = new BasicAuthentication();
        System.out.println("Basic Authentication Result: " + basicAuthentication.authenticate("admin", "admin123"));

        // Two-factor authentication
        TwoFactorAuthenticationDecorator twoFactorAuthentication = new TwoFactorAuthenticationDecorator(new BasicAuthentication());
        System.out.println("Two-Factor Authentication Result: " + twoFactorAuthentication.authenticate("admin", "admin123"));

        Authentication roleBasedAuthentication = new RoleBasedAccessControlDecorator(new BasicAuthentication());
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
    }

}
