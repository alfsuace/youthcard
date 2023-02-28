package com.alfsuace.youthCard.data;

import com.alfsuace.youthCard.data.local.BussinesFileLocalDataSource;
import com.alfsuace.youthCard.domain.useCase.BussinesRepository;

public class BussinesDataRepository implements BussinesRepository {
    private BussinesFileLocalDataSource bussinesFileLocalDataSource;
    public BussinesDataRepository(BussinesFileLocalDataSource bussinesFileLocalDataSource){
        this.bussinesFileLocalDataSource=bussinesFileLocalDataSource;
    }

    @Override
    public void save() {

    }
}
