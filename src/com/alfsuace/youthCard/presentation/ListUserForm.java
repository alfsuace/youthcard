package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.UserDataRepository;
import com.alfsuace.youthCard.data.local.UserFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.User;
import com.alfsuace.youthCard.domain.useCase.ReadUserUseCase;

public class ListUserForm {
    public void list(){
        ReadUserUseCase readUserUseCase = new ReadUserUseCase(
                new UserDataRepository(UserFileLocalDataSource.getInstance()));
        for (User user: users){
            System.out.println(user.toString());
        }
    }

}
