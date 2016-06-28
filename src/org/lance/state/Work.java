package org.lance.state;

public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Работаю...");
        context.setState(new WeekEnd());
    }
}
