package com.example.backend.dto;

import com.example.backend.valid.UniqueUserName;
import org.hibernate.annotations.BatchSize;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserCreateDTO {

    @NotNull(message = "{backend.constraints.firstName.NotNull.message}")
    @Size(min = 2,max = 30,message = "{backend.constraints.firstName.Size.message}")
    private String firstName;

    @NotNull(message = "{backend.constraints.lastName.NotNull.message}")
    @Size(min = 2,max = 30,message = "{backend.constraints.lastName.Size.message}")
    private String lastName;

    @NotNull(message = "{backend.constraints.userName.NotNull.message}")
    @Size(min = 4,max = 30,message = "{backend.constraints.lastName.Size.message}")
    @UniqueUserName
    private String userName;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
