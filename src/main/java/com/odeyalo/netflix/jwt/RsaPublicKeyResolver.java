package com.odeyalo.netflix.jwt;

import java.security.PublicKey;

public interface RsaPublicKeyResolver {

    PublicKey getPublicKey() throws KeyConstructionException;

}
