package com.alfsuace.youthCard.domain.useCase;

import com.alfsuace.youthCard.domain.models.Promotion;

import java.util.List;

public interface PromotionRepository {

    List<Promotion> getAll();
}
