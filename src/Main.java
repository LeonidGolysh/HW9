public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");

        System.out.println("Size: " + myArrayList.size());

        myArrayList.remove(1);

        System.out.println("Size: " + myArrayList.size());

        System.out.println("Element at index 0: " + myArrayList.get(0));
        System.out.println("Element at index 1: " + myArrayList.get(1));

        myArrayList.clear();

        System.out.println("Size: " + myArrayList.size());
    }
}