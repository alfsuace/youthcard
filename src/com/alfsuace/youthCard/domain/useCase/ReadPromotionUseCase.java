package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Promotion;

import java.util.List;

public class ReadPromotionUseCase {
    private PromotionRepository promotionRepository;

    public ReadPromotionUseCase(PromotionRepository promotionRepository){
        this.promotionRepository=promotionRepository;
    }
    public List<Promotion> execute(){
        return promotionRepository.getAll();
    }
}
