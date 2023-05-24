package HashMap;

public class MyHashMatTest {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap(10);

        myHashMap.put("key1", "Apple");
        myHashMap.put("key2", "Banana");
        myHashMap.put("key3", "Orange");
        myHashMap.put("key4", "Cherry");

        System.out.println("Size map: " + myHashMap.size());

        System.out.println("Key value key2: " + myHashMap.get("key2"));
        System.out.println("Key value key3: " + myHashMap.get("key3"));

        myHashMap.remove("key2");
        myHashMap.remove("key3");

        System.out.println("Map size after removing: " + myHashMap.size());
        System.out.println("Key value key2 after removing: " + myHashMap.get("key2"));

        myHashMap.clear();
        System.out.println("Map size after clearing: " + myHashMap.size());
    }
}
