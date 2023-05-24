package Stack;

import java.util.EmptyStackException;

public class MyStack {
    private Object[] stackArray;
    private int top;

    public MyStack() {
        stackArray = new Object[10];
        top = -1;
    }

    public void push(Object value) {
        if(top == stackArray.length - 1) {
            resizeArray();
        }
        stackArray[++top] = value;
    }

    public Object pop() {
        if(top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public Object peek() {
        if(top == 1) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public void clear() {
        stackArray = new Object[10];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    private void resizeArray() {
        Object[] newArray = new Object[stackArray.length * 2];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }
}
