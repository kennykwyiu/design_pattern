package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

public abstract class AuthenticationDecorator implements Authentication {
    private Authentication authentication;

    public AuthenticationDecorator(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return authentication.authenticate(username, password);
    }

    public abstract boolean authenticate(String username, String password, String token);
}
