package org.lance.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello"))));
        printer.print();
    }
}
