package com.zwy.pattern.strategy;

/**
 * Created by zwy on 2019/5/25.
 * 满300-30 支付的时候直接减去30
 */
public class ManJianPromotion implements Promotion {

    @Override
    public void doPromotion() {
        System.out.println("满减满足多少减去多少");
    }
}
