package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

public class RoleBasedAccessControlDecorator extends AuthenticationDecorator {
    public RoleBasedAccessControlDecorator(Authentication authentication) {
        super(authentication);
    }

    @Override
    public boolean authenticate(String username, String password) {
        boolean isAuthenticated = super.authenticate(username, password);
        if (isAuthenticated) {
            return checkUserRole(username);
        }
        return false;
    }

    @Override
    public boolean authenticate(String username, String password, String token) {
        return false;
    }

    private boolean checkUserRole(String username) {
        // Simulated role-based access control logic
        return "admin".equals(username); // Only allow access to users with the "admin" role
    }
}
