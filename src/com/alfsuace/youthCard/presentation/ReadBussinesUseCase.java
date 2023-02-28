package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.domain.models.Bussines;
import com.alfsuace.youthCard.domain.useCase.BussinesRepository;

import java.util.List;

public class ReadBussinesUseCase {
    private BussinesRepository bussinesRepository;
    public ReadBussinesUseCase(BussinesRepository bussinesRepository){
        this.bussinesRepository=bussinesRepository;
    }
    public List<Bussines> execute(){
        return bussinesRepository.getAll();
    }
}
