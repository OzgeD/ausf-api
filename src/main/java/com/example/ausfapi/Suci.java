package com.example.ausfapi;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(type = "string")
public class Suci {
    private String suci;

    public Suci() {
        this.suci = "suci_variable";
    }

    public String getSuci() {
        return suci;
    }

    public void setSuci(String suci) {
        this.suci = suci;
    }
}
