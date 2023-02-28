package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.User;

import java.util.List;

public interface UserRepository {
    void save(User user);

    List<User> getAll();
}
