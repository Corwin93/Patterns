package org.lance.visitor;

import java.util.stream.Stream;

public class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        elements = new Element[] {new WheelElement("front right wheel"),
                new WheelElement("front left wheel"),
                new WheelElement("rear right wheel"),
                new WheelElement("rear left wheel"),
                new EngineElement(),
                new BodyElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        Stream.of(elements).forEach(o -> o.accept(visitor));
        visitor.visit(this);
    }
}
