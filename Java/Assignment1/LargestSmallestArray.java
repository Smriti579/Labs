import java.util.*;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 3, 10, 2};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}
