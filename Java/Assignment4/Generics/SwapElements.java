class ArrayUtils {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Invalid indices for swapping.");
        }
    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public class GenericSwapExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swapping (Integer array):");
        ArrayUtils.printArray(intArray);
        ArrayUtils.swapElements(intArray, 1, 3); // Swap elements at index 1 and 3
        System.out.println("After swapping:");
        ArrayUtils.printArray(intArray);
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("\nBefore swapping (String array):");
        ArrayUtils.printArray(strArray);
        ArrayUtils.swapElements(strArray, 0, 2); // Swap elements at index 0 and 2
        System.out.println("After swapping:");
        ArrayUtils.printArray(strArray);
    }
}
