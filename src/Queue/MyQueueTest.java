package Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add("Apple");
        myQueue.add("Banana");
        myQueue.add("Orange");

        System.out.println("Size: " + myQueue.size());

        String firstElement = (String) myQueue.poll();
        System.out.println("First element: " + firstElement);

        System.out.println("Queue size after deletion: " + myQueue.size());

        String peelElement = (String) myQueue.peek();
        System.out.println("First element (without deletion): " + peelElement);

        myQueue.clear();

        System.out.println("Queue size after clearing: " + myQueue.size());
    }
}
