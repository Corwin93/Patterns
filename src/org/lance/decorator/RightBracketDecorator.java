package org.lance.decorator;

public class RightBracketDecorator extends Decorator {
    public RightBracketDecorator(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
