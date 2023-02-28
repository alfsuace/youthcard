package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.User;

import java.util.List;

public class ReadUserUseCase {
    private UserRepository userRepository;

    public ReadUserUseCase(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<User> execute(){
        return  userRepository.getAll();
    }
}
