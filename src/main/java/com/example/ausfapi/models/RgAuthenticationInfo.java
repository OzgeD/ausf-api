package com.example.ausfapi.models;

import com.example.ausfapi.Suci;

public class RgAuthenticationInfo {
    private Suci suci;
    private boolean authenticatedInd;

    public RgAuthenticationInfo() {
        this.suci = new Suci();
        this.authenticatedInd = false;
    }

    public Suci getSuci() {
        return suci;
    }

    public void setSuci(Suci suci) {
        this.suci = suci;
    }

    public boolean isAuthenticatedInd() {
        return authenticatedInd;
    }

    public void setAuthenticatedInd(boolean authenticatedInd) {
        this.authenticatedInd = authenticatedInd;
    }
}
