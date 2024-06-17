package org.kenny.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String toString() {
        return  "JavaCourse{" +
                "id=" + super.getId() +
                ", name='" + this.getName() + '\'' +
                ", original price=" + this.getOriginalPrice() +  '\'' +
                ", discounted price=" + this.getPrice() +  '\'' +
                '}';
    }

}
