package org.kenny.design.pattern.structural.decorator.authentication_systems_exmaple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoFactorAuthenticationService {
    // Simulated list of valid two-factor authentication tokens
    private static final Set<String> validTokens = new HashSet<>(Arrays.asList("123456", "654321"));

    public static boolean verifyToken(String token) {
        return validTokens.contains(token);
    }
}
