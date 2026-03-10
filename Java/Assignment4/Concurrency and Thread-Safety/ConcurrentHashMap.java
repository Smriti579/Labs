import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        Thread t1 = new Thread(() -> {
            for (int i = 4; i <= 6; i++) {
                map.put(i, "Value" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (Integer key : map.keySet()) {
                System.out.println("Iterating: " + key + " -> " + map.get(key));
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Map: " + map);
    }
}
