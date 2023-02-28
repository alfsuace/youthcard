package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Bussines;

import java.util.List;

public interface BussinesRepository {
    void save();

    List<Bussines> getAll();
}
