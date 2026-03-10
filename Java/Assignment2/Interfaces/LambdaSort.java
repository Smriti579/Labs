import java.util.Arrays;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        words.sort((a, b) -> b.compareTo(a));
        System.out.println(words);
    }
}
