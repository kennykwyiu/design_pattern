package org.kenny.design.pattern.behavioral.visitor;

public interface IVisitor {
    void visit(FreeCourse freeCourse);
    void visit(CodingCourse codingCourse);
}
