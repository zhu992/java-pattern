package com.zwy.pattern.adapter;

/**
 * Created by zwy on 2019/5/25.
 * 适配器模式提供了继承和组合两种方式
 * 我们优先选择组合的方式
 */
public class Adapter2 implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
