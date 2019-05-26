package com.zwy.pattern.adapter;

/**
 * Created by zwy on 2019/5/25.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapteeTarget = new Adapter();
        adapteeTarget.request();
    }
}
