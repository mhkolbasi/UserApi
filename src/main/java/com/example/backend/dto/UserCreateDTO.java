package com.example.backend.dto;

import org.hibernate.annotations.BatchSize;

import javax.validation.constraints.Size;

public class UserCreateDTO {


    private String firstName;

    private String lastName;

    public UserCreateDTO(){

    }

    public UserCreateDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
