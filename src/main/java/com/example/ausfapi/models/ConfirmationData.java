package com.example.ausfapi.models;

import com.example.ausfapi.ResStar;

public class ConfirmationData {
    private ResStar resStar;

    public ConfirmationData() {
        this.resStar = new ResStar();
    }

    public ResStar getResStar() {
        return resStar;
    }

    public void setResStar(ResStar resStar) {
        this.resStar = resStar;
    }
}
