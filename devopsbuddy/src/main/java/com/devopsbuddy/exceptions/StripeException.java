package com.devopsbuddy.exceptions;

/**
 * Created by akash on 13/05/2016.
 */
public class StripeException extends RuntimeException {

    public StripeException(Throwable e) {
        super(e);
    }

}
