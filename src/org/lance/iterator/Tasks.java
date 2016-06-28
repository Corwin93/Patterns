package org.lance.iterator;

public class Tasks implements Container {
    private String[] tasks = {"Build", "Plant", "Bring up"};

    @Override
    public Iterator getIterator() {
        return new TasksIterator();
    }

    private class TasksIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
