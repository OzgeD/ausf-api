package com.example.ausfapi.models;

import com.example.ausfapi.AuthResult;
import com.example.ausfapi.Kseaf;
import com.example.ausfapi.Supi;

public class ConfirmationDataResponse {
    private AuthResult[] authResult;
    private Supi supi;
    private Kseaf kseaf;

    public ConfirmationDataResponse() {
        authResult = AuthResult.values();
        supi = new Supi();
        kseaf = new Kseaf();
    }

    public AuthResult[] getAuthResult() {
        return authResult;
    }

    public void setAuthResult(AuthResult[] authResult) {
        this.authResult = authResult;
    }

    public Supi getSupi() {
        return supi;
    }

    public void setSupi(Supi supi) {
        this.supi = supi;
    }

    public Kseaf getKseaf() {
        return kseaf;
    }

    public void setKseaf(Kseaf kseaf) {
        this.kseaf = kseaf;
    }
}
