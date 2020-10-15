package com.example.ausfapi;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(type = "string")
public class HxresStar {
    private String hxresStar;

    public HxresStar() {
        this.hxresStar = "hxres_variable";
    }

    public String getHxresStar() {
        return hxresStar;
    }

    public void setHxresStar(String hxresStar) {
        this.hxresStar = hxresStar;
    }
}
