package com.example.backend.api;

import com.example.backend.GenericResponce;
import com.example.backend.dto.UserCreateDTO;
import com.example.backend.dto.UserUpdateDTO;
import com.example.backend.dto.UserViewDTO;
import com.example.backend.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("v1/user/{id}")
    public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id) throws NotFoundException {
        final UserViewDTO user =userService.getUserById(id);
        return ResponseEntity.ok(user);
    }


    @GetMapping("v1/user")
    public ResponseEntity<List<UserViewDTO>> getUsers(){
       final List<UserViewDTO> userViewDTOList =  userService.getAllUser();
        return ResponseEntity.ok(userViewDTOList);
    }

    @PostMapping("v1/user")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserCreateDTO userCreateDTO){
        userService.createUser(userCreateDTO);
        return ResponseEntity.ok(new GenericResponce("User Created"));
    }

    @PutMapping("v1/user/{id}")
    public ResponseEntity<UserViewDTO> updateUser(@PathVariable("id") Long id,@RequestBody UserUpdateDTO userUpdateDTO){
        final UserViewDTO user = userService.updateUser(id,userUpdateDTO);
        return ResponseEntity.ok(user);
    }
    @DeleteMapping("v1/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return ResponseEntity.ok(new GenericResponce("User DELETED"));
    }

    @GetMapping("v1/user/slice")
    public ResponseEntity<List<UserViewDTO>> slice(Pageable pageable){
    final List<UserViewDTO> users = userService.slice(pageable);
        return ResponseEntity.ok(users);
    }



}
