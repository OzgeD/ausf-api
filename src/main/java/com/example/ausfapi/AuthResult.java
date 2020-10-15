package com.example.ausfapi;

import io.swagger.v3.oas.annotations.media.Schema;

public enum AuthResult {
    AUTHENTICATION_SUCCESS,
    AUTHENTICATION_FAILURE,
    AUTHENTICATION_ONGOING;
}
