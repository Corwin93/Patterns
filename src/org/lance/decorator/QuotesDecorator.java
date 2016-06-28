package org.lance.decorator;

public class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
