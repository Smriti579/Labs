import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(105, "Alice");
        students.put(102, "Bob");
        students.put(108, "Charlie");
        students.put(101, "David");
        System.out.println("Sorted TreeMap (by keys): " + students);
    }
}
