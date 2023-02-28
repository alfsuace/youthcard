package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.BussinesDataRepository;
import com.alfsuace.youthCard.data.local.BussinesFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Bussines;


public class ListBussinesForm {
    public void list(){
        ReadBussinesUseCase readBussinesUseCase = new ReadBussinesUseCase(
                new BussinesDataRepository(BussinesFileLocalDataSource.getInstance()));
    for (Bussines bussines : bussineses){
        System.out.println(bussines.toString());
    }
    }
}
