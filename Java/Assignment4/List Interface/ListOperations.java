import java.util.ArrayList;
import java.util.List;
public class ListOperations {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println("After adding elements: " + names);
        names.remove("Bob");  // Remove by value
        System.out.println("After removing 'Bob': " + names);
        names.remove(1);  // Remove by index
        System.out.println("After removing element at index 1: " + names);
        names.set(0, "Eve"); // Replacing "Alice" with "Eve"
        System.out.println("After replacing first element: " + names);
    }
}
