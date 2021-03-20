package com.example.backend.service;

import com.example.backend.dto.UserCreateDTO;
import com.example.backend.dto.UserUpdateDTO;
import com.example.backend.dto.UserViewDTO;
import com.example.backend.model.User;
import javassist.NotFoundException;

import java.util.List;

public interface UserService {

    UserViewDTO getUserById(Long id) throws NotFoundException;

    List<UserViewDTO> getAllUser();

    UserViewDTO createUser(UserCreateDTO userCreateDTO);

    UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

    void deleteUser(Long id);
}
