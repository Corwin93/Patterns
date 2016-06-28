package org.lance.visitor;

public interface Visitor {
    void visit(EngineElement element);
    void visit(BodyElement element);
    void visit(WheelElement element);
    void visit(CarElement element);
}
