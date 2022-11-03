package com.mjvgames.appmjvgames.exceptions;

public class Exception extends RuntimeException{

    public Exception(Object id){
        super("Resource not found" + id);
    }
}
