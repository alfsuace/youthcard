package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.PromotionDataRepository;
import com.alfsuace.youthCard.data.local.PromotionFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Promotion;
import com.alfsuace.youthCard.domain.useCase.CreatePromotionUseCase;
import com.alfsuace.youthCard.domain.useCase.PromotionRepository;

public class NewPromotionForm {

    public void createNewPromotion(){
        Promotion promotion = builPromotion();
        savePromotion(promotion);
    }

    private Promotion builPromotion(){
        Promotion promotion= new Promotion();
        promotion.setId("1");
        promotion.setDescription("asdf");
        promotion.setDiscount(10);
        promotion.setTitle("añskldfjñ");
        return promotion;
    }

    public void savePromotion(Promotion promotion){
        CreatePromotionUseCase createPromotionUseCase = new CreatePromotionUseCase(
                new PromotionDataRepository(PromotionFileLocalDataSource.getInstance()));
        createPromotionUseCase.execute(promotion);
    }

}
