package com.alfsuace.youthCard.data;

import com.alfsuace.youthCard.data.local.UserFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.User;
import com.alfsuace.youthCard.domain.useCase.UserRepository;

public class UserDataRepository implements UserRepository {

    private UserFileLocalDataSource userFileLocalDataSource;

   public UserDataRepository(UserFileLocalDataSource userFileLocalDataSource){
        this.userFileLocalDataSource=userFileLocalDataSource;
   }

    @Override
    public void save(User user) {

    }
}
