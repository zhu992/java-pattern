package com.zwy.pattern.strategy;

/**
 * Created by zwy on 2019/5/25.
 */
public class PromotionActivity {
    private Promotion promotion;

    public PromotionActivity(Promotion promotion) {
        this.promotion = promotion;
    }

    public void executePrototion() {
        promotion.doPromotion();
    }
}
