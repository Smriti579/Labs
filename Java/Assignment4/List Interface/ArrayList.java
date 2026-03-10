import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        // Iterating using for-each loop
        System.out.println("Fruits: " + fruits);
        // Removing an element
        fruits.remove("Banana");
        // Checking size and element presence
        System.out.println("After removal: " + fruits);
        System.out.println("Contains 'Cherry'? " + fruits.contains("Cherry"));
        System.out.println("Size: " + fruits.size());
    }
}
