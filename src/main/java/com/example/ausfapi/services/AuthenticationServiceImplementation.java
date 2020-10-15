package com.example.ausfapi.services;

import com.example.ausfapi.models.AuthenticationInfo;
import com.example.ausfapi.models.RgAuthenticationCtx;
import com.example.ausfapi.models.RgAuthenticationInfo;
import com.example.ausfapi.models.UEAuthenticationCtx;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service("authservice")
public class AuthenticationServiceImplementation implements AuthenticationService {
    private List<AuthenticationInfo> authenticationInfoList = new ArrayList<>();
    private List<UEAuthenticationCtx> ueAuthenticationList = new ArrayList<>();
    private List<RgAuthenticationInfo> rgauthenticationInfoList = new ArrayList<>();
    private List<RgAuthenticationCtx> rgAuthenticationCtxList = new ArrayList<>();

    @Override
    public void saveUEAuthInfo(AuthenticationInfo ai) {
        authenticationInfoList.add(ai);
    }

    @Override
    public void saveUEAuthCtx(UEAuthenticationCtx ue_ai) {
        ueAuthenticationList.add(ue_ai);
    }

    @Override
    public void saveRGAuthInfo(RgAuthenticationInfo rg_ai) { rgauthenticationInfoList.add(rg_ai); }


    @Override
    public void saveRGAuthCtx(RgAuthenticationCtx rg_ctx) {
        rgAuthenticationCtxList.add(rg_ctx);
    }



    @Override
    public Object restTemplateFunction(AuthenticationInfo authInfo) {
        RestTemplate restTemplate=new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<AuthenticationInfo> entity = new HttpEntity<AuthenticationInfo>(authInfo,headers);
        System.out.println(entity.toString());

        final String uri = "http://localhost:8081/imsi-286010000000002/security-information/generate-auth-data";

        return restTemplate.postForObject(uri,entity, Object.class);

    }
}
