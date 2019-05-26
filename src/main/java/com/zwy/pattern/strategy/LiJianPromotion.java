package com.zwy.pattern.strategy;

/**
 * Created by zwy on 2019/5/25.
 * 新用户立减10
 */
public class LiJianPromotion implements Promotion {
    @Override
    public void doPromotion() {
        System.out.println("立减活动直接减去配置的价格");
    }
}
