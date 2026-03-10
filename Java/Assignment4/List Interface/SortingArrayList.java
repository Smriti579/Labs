import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList and adding elements
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");
        // Sorting in alphabetical order
        Collections.sort(names);
        System.out.println("Sorted in alphabetical order: " + names);
        // Sorting in reverse alphabetical order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted in reverse alphabetical order: " + names);
    }
}
