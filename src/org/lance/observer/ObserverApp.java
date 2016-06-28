package org.lance.observer;

public class ObserverApp {
    public static void main(String[] args) {
        Observable newYorkTimes = new Newspaper();
        Observer subscriber1 = new Subscriber("Lee");
        Observer subscriber2 = new Subscriber("Clementine");

        newYorkTimes.addObserver(subscriber1);
        newYorkTimes.addObserver(subscriber2);
        newYorkTimes.notifyObservers();

        newYorkTimes.removeObserver(subscriber1);
        newYorkTimes.notifyObservers();
    }
}
