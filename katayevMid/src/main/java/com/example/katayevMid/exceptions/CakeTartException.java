package com.example.katayevMid.exceptions;

import io.swagger.annotations.Api;

@Api(value = "custom type mismatch exception")
public class CakeTartException extends Exception {
    public CakeTartException(String message) {
        super(message);
    }
}
