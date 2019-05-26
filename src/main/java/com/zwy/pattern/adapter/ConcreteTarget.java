package com.zwy.pattern.adapter;

/**
 * Created by zwy on 2019/5/25.
 * 目标类
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("ConcreteTarget的目标方法");
    }
}
