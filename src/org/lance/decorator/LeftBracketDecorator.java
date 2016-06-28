package org.lance.decorator;

public class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
