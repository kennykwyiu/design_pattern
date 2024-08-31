package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

public class TwoFactorAuthenticationDecorator extends AuthenticationDecorator {
    public TwoFactorAuthenticationDecorator(Authentication authentication) {
        super(authentication);
    }

//    @Override
//    public boolean authenticate(String username, String password) {
//        // Additional two-factor authentication logic
//        // Simulated: Check if a token is provided along with username and password
//        return super.authenticate(username, password) && checkTwoFactorToken(username);
//    }

    private boolean checkTwoFactorToken(String username) {
        // Simulated: Two-factor authentication token verification logic
        // This can be a real validation process involving OTPs or other mechanisms
        return true;
    }

    @Override
    public boolean authenticate(String username, String password, String token) {
        if (new BasicAuthentication().authenticate(username, password)) {
            return TwoFactorAuthenticationService.verifyToken(token);
        }
        return false;
    }
}
