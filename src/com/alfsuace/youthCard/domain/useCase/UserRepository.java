package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.User;

public interface UserRepository {
    void save(User user);
}
