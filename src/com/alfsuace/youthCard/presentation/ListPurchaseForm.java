package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.PurchaseDataRepository;
import com.alfsuace.youthCard.data.local.PurchaseFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Purchase;
import com.alfsuace.youthCard.domain.useCase.ReadPurchaseUseCase;

public class ListPurchaseForm {

    public void list(){
        ReadPurchaseUseCase readPurchaseUseCase = new ReadPurchaseUseCase(
                new PurchaseDataRepository(PurchaseFileLocalDataSource.getInstance()));
        for (Purchase purchase : purchases){
            System.out.println(purchase.toString());
        }
    }

}
