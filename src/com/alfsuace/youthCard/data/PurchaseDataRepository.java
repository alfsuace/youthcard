package com.alfsuace.youthCard.data;

import com.alfsuace.youthCard.data.local.PurchaseFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Purchase;
import com.alfsuace.youthCard.domain.useCase.PurchaseRepository;

public class PurchaseDataRepository implements PurchaseRepository {
    private PurchaseFileLocalDataSource purchaseFileLocalDataSource;
    public PurchaseDataRepository(PurchaseFileLocalDataSource purchaseFileLocalDataSource){
        this.purchaseFileLocalDataSource=purchaseFileLocalDataSource;
    }

    @Override
    public void save(Purchase purchase) {

    }
}
