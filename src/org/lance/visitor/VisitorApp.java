package org.lance.visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Visitor hooligan = new Hooligan();
        Visitor  mechanic = new Mechanic();
        Element engine = new EngineElement();
        Element body = new BodyElement();

        engine.accept(hooligan);
        body.accept(hooligan);

        engine.accept(mechanic);
        body.accept(mechanic);

        System.out.println("________________");
        Element car = new CarElement();

        car.accept(hooligan);
        car.accept(mechanic);
    }
}
