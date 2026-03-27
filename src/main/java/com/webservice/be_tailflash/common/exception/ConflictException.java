package com.webservice.be_tailflash.common.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends ApiException {

    public ConflictException(String message) {
        super("CONFLICT", message, HttpStatus.CONFLICT);
    }

    public ConflictException(String code, String message) {
        super(code, message, HttpStatus.CONFLICT);
    }
}
