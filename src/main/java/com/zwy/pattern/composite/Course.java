package com.zwy.pattern.composite;

/**
 * Created by zwy on 2019/5/26.
 */
public class Course extends CatalogComponent {
    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //课程属于叶子节点可以获取但是不能再add

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("course name " + name + " price is " + price);
    }
}
