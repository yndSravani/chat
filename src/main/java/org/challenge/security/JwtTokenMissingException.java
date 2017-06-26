package org.challenge.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by sravz on 6/24/2017.
 */
public class JwtTokenMissingException  extends AuthenticationException {
    public JwtTokenMissingException(String msg) {
        super(msg);
    }
}
