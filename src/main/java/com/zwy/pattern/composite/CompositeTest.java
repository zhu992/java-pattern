package com.zwy.pattern.composite;

/**
 * Created by zwy on 2019/5/26.
 */
public class CompositeTest {
    public static void main(String[] args) {
        CatalogComponent mainCatalog = new CourseCatalog("主目录", 1);
        CatalogComponent course1 = new Course("课程一", 15);
        CatalogComponent course2 = new Course("课程二", 16);


        CatalogComponent catalog1 = new CourseCatalog("目录一", 2);
        CatalogComponent course11 = new Course("目录一下课程一", 15);
        CatalogComponent course12 = new Course("目录一下课程二", 16);
        catalog1.add(course11);
        catalog1.add(course12);

        mainCatalog.add(course1);
        mainCatalog.add(course2);
        mainCatalog.add(catalog1);

        mainCatalog.print();
    }
}
