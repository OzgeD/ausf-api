package com.example.ausfapi;

import io.swagger.v3.oas.annotations.media.Schema;

public class ResStar {
    private String resStar;
    private boolean nullable;

    public ResStar() {
        this.resStar = "res__variable";
        this.nullable = true;
    }

    public String getResStar() {
        return resStar;
    }

    public void setResStar(String resStar) {
        this.resStar = resStar;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }
}
