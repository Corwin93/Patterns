package org.lance.state;

public class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if(count < 3) {
            System.out.println("Отдыхаю...");
            count++;
        } else {
            context.setState(new Work());
            context.doSomething();
        }

    }
}
