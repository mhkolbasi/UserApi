package com.example.backend.dto;

import javax.validation.constraints.NotNull;

public class UserUpdateDTO {

    @NotNull(message = "{backend.constraints.firstName.NotNull.message}")
    private String firstName;

    @NotNull(message = "{backend.constraints.lastName.NotNull.message}")
    private String lastName;

    public UserUpdateDTO(){

    }

    public UserUpdateDTO(String firstName, String lastName) {
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
