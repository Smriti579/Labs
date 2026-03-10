import java.util.*;
class CollectionUtils {
    // Generic method to print elements of any collection
    public static <T> void printCollection(Collection<T> collection) {
        for (T element : collection) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public class GenericCollectionPrinter {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        System.out.print("List Elements: ");
        CollectionUtils.printCollection(intList);
        Set<String> strSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.print("Set Elements: ");
        CollectionUtils.printCollection(strSet);
        Queue<Double> doubleQueue = new LinkedList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        System.out.print("Queue Elements: ");
        CollectionUtils.printCollection(doubleQueue);
    }
}
