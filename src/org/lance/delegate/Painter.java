package org.lance.delegate;

public class Painter {
    Graphics graphics;

    public Painter(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw() {
        graphics.draw();
    }
}
