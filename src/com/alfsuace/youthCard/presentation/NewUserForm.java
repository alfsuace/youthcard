package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.UserDataRepository;
import com.alfsuace.youthCard.data.local.UserFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.User;
import com.alfsuace.youthCard.domain.useCase.CreateUserUseCase;
import com.alfsuace.youthCard.domain.useCase.UserRepository;

public class NewUserForm {

    //private CreateUserUseCase createUserUseCase;

    public void createNewUser(){
        User user = buildUser();
        saveUser(user);
    }
    private void saveUser(User user){
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(
                new UserDataRepository(UserFileLocalDataSource.getInstance()));
        createUserUseCase.execute(user);
    }

    private User buildUser(){
        User user = new User();
        user.setName("Dani");
        user.setAddress("Direccion");
        user.setNif("54656s");
        user.setSurname("Sanchez");
    }

}
