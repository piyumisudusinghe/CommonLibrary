package org.enactor.commonlibrary.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError
{
    private int errorCode;
    private String errorMessage;

    public ApiError()
    {
    }

    public ApiError(int errorCode, String errorMessage)
    {
        this.setErrorCode(errorCode);
        this.setErrorMessage(errorMessage);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
