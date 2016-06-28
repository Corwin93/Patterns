package org.lance.decorator;

public abstract class Decorator implements PrinterInterface {
    protected PrinterInterface printer;

    public Decorator(PrinterInterface printer) {
        this.printer = printer;
    }

    public void print() {
        printer.print();
    }
}
