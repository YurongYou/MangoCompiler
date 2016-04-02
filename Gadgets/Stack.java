package Gadgets;

import java.util.LinkedList;

/**
 * Simple stack implemented by LinkedList.
 * Created by Ficos on 16/4/2.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public Boolean isEmpty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}