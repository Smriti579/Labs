import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        // Peek at the top element
        System.out.println("Top element: " + stack.peek());
        // Popping elements
        System.out.println("Popped: " + stack.pop());
        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Stack after pop: " + stack);
    }
}
