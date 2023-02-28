package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Bussines;

public class CreateBussinesUseCase {
    private BussinesRepository bussinesRepository;

    public CreateBussinesUseCase(BussinesRepository bussinesRepository){
        this.bussinesRepository=bussinesRepository;
    }
    public void execute(Bussines bussines){
        bussinesRepository.save();
    }
}
