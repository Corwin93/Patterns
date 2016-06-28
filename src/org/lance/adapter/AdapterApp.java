package org.lance.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        //Через наследование
        VectorGraphicsInterface vg = new VectorAdapterFromRaster();
        vg.drawLine();
        vg.drawSquare();
        //Через композицию
        VectorGraphicsInterface vg2 = new VectorAdapterFromRaster2();
        vg2.drawLine();
        vg.drawSquare();
    }
}
