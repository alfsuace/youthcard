package com.alfsuace.youthCard.presentation;

import com.alfsuace.youthCard.data.PromotionDataRepository;
import com.alfsuace.youthCard.data.local.PromotionFileLocalDataSource;
import com.alfsuace.youthCard.domain.models.Promotion;
import com.alfsuace.youthCard.domain.useCase.ReadPromotionUseCase;

public class ListPromotionForm {
    public void list(){
        ReadPromotionUseCase readPromotionUseCase = new ReadPromotionUseCase(
                new PromotionDataRepository(PromotionFileLocalDataSource.getInstance()));
    }
    for(Promotion promotion : promotions){
        System.out.println(promotion.toString());
    }
}
