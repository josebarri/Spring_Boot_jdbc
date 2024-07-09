package com.institucion.institucion.exception;

public class FacadeExecption extends Exception{
    public FacadeExecption() {
    }

    public FacadeExecption(String message) {
        super(message);
    }

    public FacadeExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public FacadeExecption(Throwable cause) {
        super(cause);
    }

    public FacadeExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
