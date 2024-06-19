package org.kenny.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String toString() {
        return  "JavaCourse{" +
                "id=" + super.getId() +
                ", name='" + this.getName() + '\'' +
                ", original price=" + super.getPrice() +  '\'' +
                ", discounted price=" + this.getDiscountPrice() +  '\'' +
                '}';
    }

}
