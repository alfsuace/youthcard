package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.User;

public class CreateUserUseCase {
    private UserRepository userRepository;

    public CreateUserUseCase (UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void execute(User user){
        userRepository.save(user);
    }
}
