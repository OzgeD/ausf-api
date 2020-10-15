package com.example.ausfapi.models;

import com.example.ausfapi.AuthResult;
import com.example.ausfapi.EapPayload;
import com.example.ausfapi.Kseaf;
import com.example.ausfapi.Supi;

public class EapSession {
    private EapPayload eapPayload;
    private Kseaf kSeaf;
    private String __links;
    private AuthResult[] authResult;
    private Supi supi;

    public EapSession() {
        this.eapPayload = new EapPayload();
        this.kSeaf = new Kseaf();
        this.__links = "demo.demo";
        authResult = AuthResult.values();
        supi = new Supi();
    }

    public EapPayload getEapPayload() {
        return eapPayload;
    }

    public void setEapPayload(EapPayload eapPayload) {
        this.eapPayload = eapPayload;
    }

    public Kseaf getkSeaf() {
        return kSeaf;
    }

    public void setkSeaf(Kseaf kSeaf) {
        this.kSeaf = kSeaf;
    }

    public String get__links() {
        return __links;
    }

    public void set__links(String __links) {
        this.__links = __links;
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
}
