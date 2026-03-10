import java.util.LinkedList;
import java.util.Queue;
public class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.add("Alice");
        ticketQueue.add("Bob");
        ticketQueue.add("Charlie");
        ticketQueue.add("David");
        System.out.println("Initial Ticket Queue: " + ticketQueue);
        while (!ticketQueue.isEmpty()) {
            System.out.println("Ticket booked for: " + ticketQueue.poll()); // Removes the first customer
        }
        System.out.println("All tickets booked, queue is empty: " + ticketQueue);
    }
}
