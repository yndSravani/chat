package org.challenge.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by sravz on 6/24/2017.
 */
public class JwtUtil {
    private static String secret="a litte secret";

    public static UserDetails parseToken(String token) {
        try {
            final Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            UserDetails u = new UserDetails() {
                @Override
                public Collection<? extends GrantedAuthority> getAuthorities() {
                    return (Collection<? extends GrantedAuthority>) body.get("role");
                }

                @Override
                public String getPassword() {
                    return null;
                }

                @Override
                public String getUsername() {
                    return body.getSubject();
                }

                @Override
                public boolean isAccountNonExpired() {
                    return false;
                }

                @Override
                public boolean isAccountNonLocked() {
                    return false;
                }

                @Override
                public boolean isCredentialsNonExpired() {
                    return false;
                }

                @Override
                public boolean isEnabled() {
                    return false;
                }
            };
            return u;

        } catch (JwtException e) {
            return null;
        }
    }

    public static String generateToken(UserDetails u) {
        Claims claims = Jwts.claims().setSubject(u.getUsername());
        claims.put("userId", u.getUsername() + "");
        claims.put("roles", u.getAuthorities());

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
}
