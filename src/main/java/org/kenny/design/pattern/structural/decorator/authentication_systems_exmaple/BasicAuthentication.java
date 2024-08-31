package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

public class BasicAuthentication implements Authentication {
    @Override
    public boolean authenticate(String username, String password) {
        // Basic authentication logic
        return "admin".equals(username) && "admin123".equals(password);
    }
}
