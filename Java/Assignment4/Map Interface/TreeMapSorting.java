import java.util.TreeMap;
public class TreeMapSortingDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(50, "Alice");
        employees.put(10, "Bob");
        employees.put(40, "Charlie");
        employees.put(20, "David");
        employees.put(30, "Eve");
        System.out.println("TreeMap (Sorted by Keys): " + employees);
    }
}
