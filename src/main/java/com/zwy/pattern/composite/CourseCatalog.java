package com.zwy.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zwy on 2019/5/26.
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (level != null) {
                for (Integer i = 0; i < level; i++) {
                    System.out.print("     ");
                }
            }
            item.print();
        }
    }
}
