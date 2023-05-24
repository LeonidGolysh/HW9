public class MyArrayList {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(Object value) {
        ensureCapacity(size + 1);
        elements[size] = value;
        size++;
    }

    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for(int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }

        elements[size - 1] = null;
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    private void ensureCapacity(int requiredCapacity) {
        if(requiredCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, requiredCapacity);
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0,size);
            elements = newElements;
        }
    }
}
