package com.zwy.pattern.strategy;

/**
 * Created by zwy on 2019/5/25.
 * 满300返现30 返回的钱打入用户的账号
 */
public class FanXianPromotion implements Promotion {
    @Override
    public void doPromotion() {
        System.out.println("参与返现返现的钱直接打入用户的账号");
    }
}
