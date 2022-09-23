package com.epam.mjc;

public class IdException extends IllegalArgumentException{

    public IdException(long id) {
        super("Could not find student with ID " + id);
    }
}
