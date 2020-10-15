package com.example.ausfapi;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(type = "string")
public class Kseaf {
    private String kseaf;

    public Kseaf() {
        this.kseaf = "kseaf_variable";
    }

    public String getKseaf() {
        return kseaf;
    }

    public void setKseaf(String kseaf) {
        this.kseaf = kseaf;
    }
}
