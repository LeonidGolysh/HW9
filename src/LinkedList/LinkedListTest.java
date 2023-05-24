package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");

        System.out.println("Size: " + myLinkedList.size());

        myLinkedList.remove(1);

        System.out.println("Size: " + myLinkedList.size());

        System.out.println("Element at index 0: " + myLinkedList.get(0));
        System.out.println("Element at index 1: " + myLinkedList.get(1));

        myLinkedList.clear();

        System.out.println("Size: " + myLinkedList.size());
    }
}
