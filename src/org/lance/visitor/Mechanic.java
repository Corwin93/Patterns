package org.lance.visitor;

public class Mechanic implements Visitor {
    @Override
    public void visit(EngineElement element) {
        System.out.println("Engine has been repaired!");
    }

    @Override
    public void visit(BodyElement element) {
        System.out.println("Body has been refurbished!");
    }

    @Override
    public void visit(WheelElement element) {
        System.out.println(element.getName() + " has been balanced!");
    }

    @Override
    public void visit(CarElement element) {
        System.out.println("Mechanic has just finished full repair of the car!");
    }
}
