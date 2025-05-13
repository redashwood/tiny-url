package com.redashwood.tinyuserservice.exception;

public class TinyServerException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private TinyExceptionEnum exceptionEnum;

    public TinyServerException(TinyExceptionEnum exceptionEnum, String message) {
        super(message);
        this.exceptionEnum = exceptionEnum;
    }

    public TinyExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }
}
