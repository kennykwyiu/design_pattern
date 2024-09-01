package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

import java.util.HashMap;
import java.util.Map;

public class RoleBasedAccessControlDecorator extends AuthenticationDecorator {
    private Map<String, Role> roleMap;



    public RoleBasedAccessControlDecorator(Authentication authentication) {
        super(authentication);
        roleMap = new HashMap<>();
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

    public void addRole(Role role) {
        roleMap.put(role.getRoleName(), role);
    }

    public boolean checkAccess(User user, String resource) {
        Role userRole = roleMap.get(user.getRole());

        if (userRole != null) {
            // Check if the user's role has access to the specified resource
            // This is a simplified example, actual logic can be more complex
            return userRole.getRoleName().equals("admin") && resource.equals("adminResource");
        }

        return false;
    }
}
