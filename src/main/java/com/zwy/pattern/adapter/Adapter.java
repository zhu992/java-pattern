package com.zwy.pattern.adapter;

/**
 * Created by zwy on 2019/5/25.
 * 继承被适配者然后实现目标接口
 * 220伏特 --> 手机适配器 --> 5伏特
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
