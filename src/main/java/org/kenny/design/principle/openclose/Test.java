package org.kenny.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "From Zero to Master Java Course", 348d);
        System.out.println(javaCourse.toString());


        ICourse iCourse = new JavaDiscountCourse(96, "From Zero to Master Java Course", 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println(javaDiscountCourse.toString());
    }
}
