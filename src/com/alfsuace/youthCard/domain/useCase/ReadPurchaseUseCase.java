package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Purchase;

import java.util.List;

public class ReadPurchaseUseCase {
    private PurchaseRepository purchaseRepository;

    public ReadPurchaseUseCase(PurchaseRepository purchaseRepository){
        this.purchaseRepository=purchaseRepository;
    }
    public List<Purchase> execute(){
        return purchaseRepository.getAll();
    }
}
