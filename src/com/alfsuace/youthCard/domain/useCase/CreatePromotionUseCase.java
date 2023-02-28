package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Promotion;

public class CreatePromotionUseCase {
    private PromotionRepository promotionRepository;

    public CreatePromotionUseCase(PromotionRepository promotionRepository){
        this.promotionRepository=promotionRepository;
    }

    public void execute(Promotion promotion){
        promotionRepository.save(promotion);
    }
}
