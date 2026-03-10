import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteListDemo {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3});

        Thread t1 = new Thread(() -> list.add(4));  // Modifies the list
        Thread t2 = new Thread(() -> list.forEach(System.out::println));  // Iterates safely

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final List: " + list);
    }
}
