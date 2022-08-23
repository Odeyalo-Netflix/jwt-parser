package com.odeyalo.netflix.jwt;

import io.jsonwebtoken.Claims;

public interface JwtTokenParser extends JwtTokenValidator {

    Claims getBody(String token);
}
