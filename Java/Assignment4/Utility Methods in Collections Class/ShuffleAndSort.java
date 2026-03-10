import java.util.ArrayList;
import java.util.Collections;
public class ShuffleAndSortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 2, 9, 1, 7);
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
