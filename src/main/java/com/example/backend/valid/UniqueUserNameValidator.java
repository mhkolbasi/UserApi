package com.example.backend.valid;

import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public final class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName,String> {

    private final UserRepository userRepository;

    @Autowired
    public UniqueUserNameValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void initialize(UniqueUserName uniqueUserName) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return userRepository.existUserByUserName(s);
    }
}
