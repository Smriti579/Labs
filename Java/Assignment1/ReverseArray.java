import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 1, 3};

        // Reverse the array manually
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
