package com.example.ausfapi.models;

import com.example.ausfapi.Supi;

public class DeregistrationInfo {
    private Supi supi;

    public DeregistrationInfo() {
        this.supi = new Supi();
    }

    public Supi getSupi() {
        return supi;
    }

    public void setSupi(Supi supi) {
        this.supi = supi;
    }
}
