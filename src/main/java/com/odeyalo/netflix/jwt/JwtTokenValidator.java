package com.odeyalo.netflix.jwt;

public interface JwtTokenValidator {

    boolean isTokenValid(String token);

}
