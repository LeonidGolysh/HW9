package LinkedList;


import java.nio.file.attribute.UserDefinedFileAttributeView;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private Object value;
        private Node previous;
        private Node next;

        public Node(Object value, Node previous, Node next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value, tail, null);
        if(tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node nodeToRemove = getNodeAtIndex(index);

        Node previousNode = nodeToRemove.previous;
        Node nextNode = nodeToRemove.next;

        if (previousNode != null) {
            previousNode.next = nextNode;
        } else {
            head = nextNode;
        }

        if (nextNode != null) {
            nextNode.previous = previousNode;
        } else {
            tail = previousNode;
        }


        if (head == null) {
            tail = null;
        }

        nodeToRemove.previous = null;
        nodeToRemove.next = null;
        size--;
    }

    public void clear() {
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.previous = null;
            currentNode.next = null;
            currentNode = nextNode;
        }
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node node = getNodeAtIndex(index);
        return node.value;
    }

    private Node getNodeAtIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode;
        if(index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index ; i--) {
                currentNode = currentNode.previous;
            }
        }
        return currentNode;
    }
}
