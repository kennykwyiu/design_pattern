package org.kenny.design.pattern.behavioral.visitor;

public class Visitor implements IVisitor{
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("Free Course: " + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("Coding Course: " + codingCourse.getName() + ", Course price: $" + codingCourse.getPrice());
    }
}
