import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        // (a) Creating and adding key-value pairs
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        // (b) Checking if a key exists
        int searchKey = 102;
        if (employees.containsKey(searchKey)) {
            System.out.println("Employee ID " + searchKey + " exists: " + employees.get(searchKey));
        }

        // (c) Iterating using KeySet
        System.out.println("\nIterating using KeySet:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }
        System.out.println("\nIterating using EntrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
