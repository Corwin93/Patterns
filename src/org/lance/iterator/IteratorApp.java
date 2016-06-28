package org.lance.iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Container container = new Tasks();
        Iterator iterator = container.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
