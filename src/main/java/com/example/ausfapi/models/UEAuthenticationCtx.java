package com.example.ausfapi.models;

import com.example.ausfapi.AuthType;
import com.example.ausfapi.Av5gAka;

public class UEAuthenticationCtx {
    private AuthType[] authType;
    //private Av5gAka av5gAka;

    private String AuthData5g;

    private String __links, servingNetworkName;

    public UEAuthenticationCtx() {
        authType = AuthType.values();
        AuthData5g = "av5gAka";
        __links = "links_variable";
        servingNetworkName = "servingNetworkName_variable";
    }

    public UEAuthenticationCtx(AuthType[] authType, String AuthData5g, String __links, String servingNetworkName) {
        this.authType = authType;
        this.AuthData5g = AuthData5g;
        this.__links = __links;
        this.servingNetworkName = servingNetworkName;
    }

    public AuthType[] getAuthType() {
        return authType;
    }

    public void setAuthType(AuthType[] authType) {
        this.authType = authType;
    }

    public String getAuthData5g() {
        return AuthData5g;
    }

    public void setAuthData5g(String authData5g) {
        AuthData5g = authData5g;
    }

    public String get__links() {
        return __links;
    }

    public void set__links(String __links) {
        this.__links = __links;
    }

    public String getServingNetworkName() {
        return servingNetworkName;
    }

    public void setServingNetworkName(String servingNetworkName) {
        this.servingNetworkName = servingNetworkName;
    }

    @Override
    public String toString() {
        return "UEAuthenticationCtx{" +
                "authType=" + authType +
                ", AuthData5g='" + AuthData5g + '\'' +
                ", __links='" + __links + '\'' +
                ", servingNetworkName='" + servingNetworkName + '\'' +
                '}';
    }
}
