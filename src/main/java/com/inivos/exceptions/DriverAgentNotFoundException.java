package com.inivos.exceptions;

public class DriverAgentNotFoundException extends Exception {
    /**
     * This exception will be returned ig
     * @param message
     */
    public DriverAgentNotFoundException(String message){
        super(message);
    }
}
