package com.alfsuace.youthCard.data;

import com.alfsuace.youthCard.data.local.PromotionFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Promotion;
import com.alfsuace.youthCard.domain.useCase.PromotionRepository;

import java.util.List;

public class PromotionDataRepository implements PromotionRepository {

    private PromotionFileLocalDataSource promotionFileLocalDataSource;

    public PromotionDataRepository(PromotionFileLocalDataSource promotionFileLocalDataSource){
        this.promotionFileLocalDataSource=promotionFileLocalDataSource;
    }


    @Override
    public List<Promotion> getAll() {
        return null;
    }

    @Override
    public void save(Promotion promotion) {

    }
}
