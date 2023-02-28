package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Purchase;

import java.util.List;

public interface PurchaseRepository {

    void save(Purchase purchase);

    List<Purchase> getAll();
}
