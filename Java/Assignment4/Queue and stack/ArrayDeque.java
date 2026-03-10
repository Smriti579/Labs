import java.util.ArrayDeque;
public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // (a) Adding elements at both ends
        deque.addFirst(10); // Adds to the front
        deque.addLast(20);  // Adds to the rear
        deque.addFirst(5);  // Adds to the front again
        System.out.println("Deque after additions: " + deque);

        // (b) Removing elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        // (c) Peek at both ends
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());
    }
}
