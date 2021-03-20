package com.example.backend.dto;

import com.example.backend.model.User;

import java.io.Serializable;

public final class UserViewDTO  implements Serializable {


    private String firstName;

    private String  lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private UserViewDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static UserViewDTO of(User user){
        return new UserViewDTO(user.getFirstName(),user.getLastName());
    }

}
