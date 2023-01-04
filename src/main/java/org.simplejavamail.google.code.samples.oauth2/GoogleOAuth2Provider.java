package org.simplejavamail.google.code.samples.oauth2;

import java.security.Provider;

public final class GoogleOAuth2Provider extends Provider {

    private static final long serialVersionUID = 1L;

    public GoogleOAuth2Provider() {
        super("Google OAuth2 Provider", 1.0, "Provides the XOAUTH2 SASL Mechanism");
        put("SaslClientFactory.XOAUTH2", OAuth2SaslClientFactory.class.getName());
    }
}