package com.example.ausfapi;

import io.swagger.v3.oas.annotations.media.Schema;

public class Supi {
    private String supi;

    public Supi() {
        this.supi = "supi_variable";
    }

    public String getSupi() {
        return supi;
    }

    public void setSupi(String supi) {
        this.supi = supi;
    }
}
