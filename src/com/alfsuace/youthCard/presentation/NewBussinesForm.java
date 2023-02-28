package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.BussinesDataRepository;
import com.alfsuace.youthCard.domain.models.Bussines;
import com.alfsuace.youthCard.domain.useCase.CreateBussinesUseCase;
import com.alfsuace.youthCard.data.local.BussinesFileLocalDataSource;

public class NewBussinesForm {
    public void createNewBussines(){
        Bussines bussines= buildBussines();
        saveBussines(bussines);
    }

    private void saveBussines(Bussines bussines){
        CreateBussinesUseCase addBussinesUseCase = new CreateBussinesUseCase(
                new BussinesDataRepository(BussinesFileLocalDataSource.getInstance()));
        addBussinesUseCase.execute(bussines);
    }

    private Bussines buildBussines(){
        Bussines bussines = new Bussines();
        bussines.setCif("alkdsfjñk");
        bussines.setId("1");
        bussines.setName("nombre 1");
        return bussines;
    }

}
