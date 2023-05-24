package Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("Apple");
        myStack.push("Banana");
        myStack.push("Orange");
        myStack.push("Cherry");

        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.clear();
        System.out.println(myStack.size());
    }
}
