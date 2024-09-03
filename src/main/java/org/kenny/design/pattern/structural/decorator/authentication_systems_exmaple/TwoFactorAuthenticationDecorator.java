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
        if (AccountLockout.isAccountLocked(username)) {
            System.out.println("Account is locked. Please try again later.");
            AccountLockout.sendLockoutNotification(username);
            AccountLockout.sendPasswordResetLink(username);
            return false;
        }

        if (new BasicAuthentication().authenticate(username, password)) {
            if (TwoFactorAuthenticationService.verifyToken(token)) {
                AccountLockout.resetFailedLoginAttempts(username);
                return true;
            } else {
                AccountLockout.handleFailedLoginAttempt(username);
            }
        } else {
            AccountLockout.handleFailedLoginAttempt(username);
        }
        return false;
    }
}
