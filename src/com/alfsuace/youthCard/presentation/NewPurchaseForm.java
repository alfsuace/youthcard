package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.PurchaseDataRepository;
import com.alfsuace.youthCard.data.local.PurchaseFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Purchase;
import com.alfsuace.youthCard.domain.useCase.CreatePurchaseUseCase;

public class NewPurchaseForm {

    public void createPurchase(){
        Purchase purchase=buildPurchase();
        savePurchase(purchase);
    }
    private Purchase buildPurchase(){
        Purchase purchase = new Purchase();
        purchase.setDate("10/10/2020");
        purchase.setId("1");
        purchase.setPromotion(null);
        purchase.setUser(null);
        return purchase;
    }
    private void savePurchase(Purchase purchase){
        CreatePurchaseUseCase createPurchaseUseCase = new CreatePurchaseUseCase(
        new PurchaseDataRepository(PurchaseFileLocalDataSource.getInstance()));
    }
}
