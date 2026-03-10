import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 3, 8, 2, 5};
        int[] uniqueArr = Arrays.stream(arr).distinct().toArray();
        System.out.println("Array without Duplicates: " + Arrays.toString(uniqueArr));
    }
}
