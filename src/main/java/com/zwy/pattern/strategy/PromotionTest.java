package com.zwy.pattern.strategy;

/**
 * Created by zwy on 2019/5/25.
 */
public class PromotionTest {
    public static void main(String[] args) {

        FanXianPromotion fanXianPromotion = new FanXianPromotion();

        ManJianPromotion manJianPromotion = new ManJianPromotion();

        PromotionActivity activity618 = new PromotionActivity(fanXianPromotion);

        PromotionActivity activity1111 = new PromotionActivity(manJianPromotion);

        activity618.executePrototion();

        activity1111.executePrototion();
    }
}
