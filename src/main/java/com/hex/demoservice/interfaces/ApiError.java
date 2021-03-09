package com.hex.demoservice.interfaces;

public class ApiError {

    private final Error error;

    private ApiError(int status, String message, String errorCode) {
        this.error = new Error(status, message, errorCode);
    }

    public ApiError(Error error) {
        this.error = error;
    }

    public static ApiError of(int status, String message, String errorCode) {
        return new ApiError(status, message, errorCode);
    }

    public static ApiError internalServerError() {
        return new ApiError(500, "The execution of the service failed.", "9999");
    }

    public static ApiError endpointNotFound(String path) {
        return new ApiError(404, "The endpoint you've requested not found, path:" + path, "9998");
    }

    public Error getError() {
        return this.error;
    }
}
