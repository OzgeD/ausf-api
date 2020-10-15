package com.example.ausfapi.models;

import com.example.ausfapi.AuthResult;
import com.example.ausfapi.Supi;

public class RgAuthenticationCtx {
    AuthResult[] auth;
    Supi supi;
    boolean authInd;

    public RgAuthenticationCtx() {
        auth = AuthResult.values();
        supi = new Supi();
        authInd = false;
    }

    public AuthResult[] getAuth() {
        return auth;
    }

    public void setAuth(AuthResult[] auth) {
        this.auth = auth;
    }

    public Supi getSupi() {
        return supi;
    }

    public void setSupi(Supi supi) {
        this.supi = supi;
    }

    public boolean isAuthInd() {
        return authInd;
    }

    public void setAuthInd(boolean authInd) {
        this.authInd = authInd;
    }
}
