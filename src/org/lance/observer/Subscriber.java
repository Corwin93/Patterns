package org.lance.observer;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent() {
        System.out.println(name + " has just received notification about new issue.");
    }
}
