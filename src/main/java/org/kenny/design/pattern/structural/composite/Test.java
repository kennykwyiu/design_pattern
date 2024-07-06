package org.kenny.design.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux Course", 11);
        CatalogComponent windowsCourse = new Course("Windows Course", 12);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java Course Catalog", 2);

        CatalogComponent mmallCourse1 = new Course("Java ECommerce - ep.1", 55);
        CatalogComponent mmallCourse2 = new Course("Java ECommerce - ep.2", 66);
        CatalogComponent designPatternCourse = new Course("Java Design Pattern Course", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPatternCourse);

        CatalogComponent kennyMainCourseCatalog = new CourseCatalog("Kenny Web Main Course Catalog", 1);
        kennyMainCourseCatalog.add(linuxCourse);
        kennyMainCourseCatalog.add(windowsCourse);
        kennyMainCourseCatalog.add(javaCourseCatalog);

        kennyMainCourseCatalog.print();
    }
}
