package org.lance.delegate;

public class DelegateApp {
    public static void main(String[] args) {
        Painter painter = new Painter(new Circle());
        painter.draw();
        painter.setGraphics(new Triangle());
        painter.draw();
    }
}