import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8};
        int key = 5;
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Element found at index: " + (index >= 0 ? index : "Not Found"));
    }
}
