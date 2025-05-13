package com.redashwood.tinyuserservice.exception;

public enum TinyExceptionEnum {

    ERROR100("ERROR-100", "Exception occurred while processing request"),
    ERROR001("ERROR-001", "Exception occurred while processing service request");


    private String errorCode;

    private String errorMessage;

    TinyExceptionEnum (String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
