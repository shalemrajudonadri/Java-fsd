package com.shalemworks.exceptionHandling;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
         
            throwCustomException();
        } catch (CustomException e) {
  
            System.err.println("CustomCheckedException caught: "+e.getMessage());
        }
    }

    public static void throwCustomException() throws CustomException {
        throw new CustomException("This is a custom checked exception.");
    }
}