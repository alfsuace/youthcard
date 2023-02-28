package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.domain.models.Bussines;

public class NewBussinesForm {
    public void createNewBussines(){
        Bussines bussines= buildBussines();
        saveBussines();
    }

    private void saveBussines(Bussines bussines){
        AddBussinesUseCase addBussinesUseCase = new AddBussinesUseCase(
                new BussinesDataRepository(BussinesFileLocalDataSoruce.getInstance()));
        addBussinesUseCase.execute(Bussines);
    }

}
