package com.example.ausfapi.services;

import com.example.ausfapi.models.AuthenticationInfo;
import com.example.ausfapi.models.RgAuthenticationCtx;
import com.example.ausfapi.models.RgAuthenticationInfo;
import com.example.ausfapi.models.UEAuthenticationCtx;

public interface AuthenticationService {
    public void saveUEAuthInfo(AuthenticationInfo ai);

    public void saveUEAuthCtx(UEAuthenticationCtx ue_ai);

    public void saveRGAuthInfo(RgAuthenticationInfo rg_ai);

    public void saveRGAuthCtx(RgAuthenticationCtx rg_ctx);

    public Object restTemplateFunction(AuthenticationInfo authInfo);
}
