import java.util.List;
import java.util.Arrays;
import java.util.Collections;
class MinMaxFinder<T extends Comparable<T>> {
    private List<T> elements;
    public MinMaxFinder(List<T> elements) {
        this.elements = elements;
    }
    public T findMin() {
        return Collections.min(elements);
    }
    public T findMax() {
        return Collections.max(elements);
    }
}
public class GenericMinMaxExample {
    public static void main(String[] args) {
        // Integer List
        List<Integer> intList = Arrays.asList(5, 1, 8, 3, 10);
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(intList);
        System.out.println("Integer List: " + intList);
        System.out.println("Min: " + intFinder.findMin());
        System.out.println("Max: " + intFinder.findMax());
        List<String> strList = Arrays.asList("Apple", "Banana", "Peach", "Mango");
        MinMaxFinder<String> strFinder = new MinMaxFinder<>(strList);
        System.out.println("\nString List: " + strList);
        System.out.println("Min: " + strFinder.findMin());
        System.out.println("Max: " + strFinder.findMax());
    }
}
