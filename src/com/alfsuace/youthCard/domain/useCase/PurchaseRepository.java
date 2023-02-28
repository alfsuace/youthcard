package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Purchase;

public interface PurchaseRepository {

    void save(Purchase purchase);
}
