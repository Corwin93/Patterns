package org.lance.visitor;

public class Hooligan implements Visitor {
    @Override
    public void visit(EngineElement element) {
        System.out.println("Engine has been broken!");
    }

    @Override
    public void visit(BodyElement element) {
        System.out.println("Body has been scratched!");
    }

    @Override
    public void visit(WheelElement element) {
        System.out.println(element.getName() + " has been hit!");
    }

    @Override
    public void visit(CarElement element) {
        System.out.println("Hooligan has just finished smoking in the car!");
    }
}
