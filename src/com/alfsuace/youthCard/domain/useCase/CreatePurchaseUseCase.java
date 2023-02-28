package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Purchase;

public class CreatePurchaseUseCase {

    private PurchaseRepository purchaseRepository;

    public CreatePurchaseUseCase(PurchaseRepository purchaseRepository){
        this.purchaseRepository=purchaseRepository;
    }

    public void execute(Purchase purchase){
        purchaseRepository.save(purchase);
    }

}
