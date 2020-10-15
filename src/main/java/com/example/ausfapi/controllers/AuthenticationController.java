package com.example.ausfapi.controllers;

import com.example.ausfapi.AuthType;
import com.example.ausfapi.models.*;
import com.example.ausfapi.services.AuthenticationService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;

@RestController
public class AuthenticationController {
    @Autowired
    AuthenticationService authservice;

    @ApiResponses(
            value = @ApiResponse(
                    responseCode = "201",
                    description = "UEAuthenticationCtx",
                    content = @Content(
                            schema = @Schema(implementation = UEAuthenticationCtx.class)
                    )
            )
    )
    @RequestMapping(value = "/ue-authentications", method = RequestMethod.POST)
    public ResponseEntity<?> createUE(@RequestBody AuthenticationInfo auInfo) {
        UEAuthenticationCtx defaultUE = new UEAuthenticationCtx();
        defaultUE.setServingNetworkName(auInfo.getServingNetworkName());

        //defaultUE.setAuthType(restTemplate.getForObject(uri, UEAuthenticationCtx.class));

        authservice.saveUEAuthCtx(defaultUE);
        authservice.saveUEAuthInfo(auInfo);

        //return new ResponseEntity<UEAuthenticationCtx>(defaultUE, HttpStatus.CREATED);

        return new ResponseEntity<>(authservice.restTemplateFunction(auInfo), HttpStatus.CREATED);

    }

    @ApiResponses(
            value = @ApiResponse(
                    responseCode = "200",
                    description = "Use to handle or close the EAP session",
                    content = @Content(
                            schema = @Schema(implementation = EapSession.class)
                    )
            )
    )
    @RequestMapping(value = "/ue-authentications/{authCtxId}/eap-session", method = RequestMethod.POST)
    public ResponseEntity<?> createEAP(@PathVariable("authCtxId") String authCtxId, @RequestBody EapSession eapSession) {
        EapSession eap = new EapSession();
        if (eap.equals(authCtxId))
            return new ResponseEntity<EapSession>(eapSession, HttpStatus.OK);

        return new ResponseEntity<EapSession>(eapSession, HttpStatus.CREATED);
    }


    @ApiResponses(
            value = @ApiResponse(
                    responseCode = "200",
                    description = "Request processed (EAP success or Failure)",
                    content = @Content(
                            schema = @Schema(implementation = ConfirmationDataResponse.class)
                    )
            )
    )
    @RequestMapping(value = "/ue-authentications/{authCtxId}/5g-aka-confirmation", method = RequestMethod.PUT)
    public ResponseEntity<?> updateAuth(@PathVariable("authCtxId") String authCtxId, @RequestBody ConfirmationData confirmationData) {
        ConfirmationDataResponse confDataRes = new ConfirmationDataResponse();

        /*if(authCtxId!=confirmationData.getResStar().toString()){
            return new ResponseEntity(confDataRes.getAuthResult()[1], HttpStatus.NOT_FOUND);
        }*/

        return new ResponseEntity<ConfirmationDataResponse>(confDataRes, HttpStatus.OK);
    }

    @ApiResponses(
            value = @ApiResponse(
                    responseCode = "201",
                    description = "RGAuthCtx",
                    content = @Content(
                            schema = @Schema(implementation = RgAuthenticationCtx.class)
                    )
            )
    )

    @RequestMapping(value = "/rg-authentications", method = RequestMethod.POST)
    public ResponseEntity<?> createRG(@RequestBody RgAuthenticationInfo rgInfo) {
        RgAuthenticationCtx defaultRG = new RgAuthenticationCtx();
        defaultRG.setAuthInd(!rgInfo.isAuthenticatedInd());

        return new ResponseEntity<RgAuthenticationCtx>(defaultRG, HttpStatus.OK);
    }

}
