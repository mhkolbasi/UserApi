package com.example.backend;

import java.time.LocalDate;
import java.util.Date;

public final  class GenericResponce {

    private String message;

    public GenericResponce(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
