package Queue;

import java.util.NoSuchElementException;

public class MyQueue {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    public MyQueue() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void add(Object value) {
        ensureCapacity();
        elements[tail] = value;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        return elements[head];
    }

    public Object poll() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        Object value = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return value;
    }

    private void ensureCapacity() {
        if(size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, head, newElements, 0, elements.length - head);
            System.arraycopy(elements, 0, newElements, elements.length - head, tail);
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}
