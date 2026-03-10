import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 7, 9);

        Collections.sort(list); // Ensure the list is sorted before binary search
        int index = Collections.binarySearch(list, 5);

        System.out.println("Index of 5: " + (index >= 0 ? index : "Not found"));
    }
}
