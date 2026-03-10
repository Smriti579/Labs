import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
       
        PriorityQueue<String> taskQueue = new PriorityQueue<>();
        
        taskQueue.add("Fix bugs (Priority 1)");
        taskQueue.add("Finish report (Priority 2)");
        taskQueue.add("Prepare presentation (Priority 3)");
        taskQueue.add("Respond to emails (Priority 4)");
      
        while (!taskQueue.isEmpty()) {
            System.out.println("Executing: " + taskQueue.poll());
        }
    }
}
