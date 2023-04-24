package AssignWeek13;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        // Queue is an interface, so we can't make an instance of it.
        // We use a linked list
        Queue<Object> queue = new LinkedList<>();

        // Using LinkedList methods, add, remove, and peek:
        System.out.println(queue.add(1)); // note this returns true if it successfully adds
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println("Size of queue " + queue.size());
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek()); // returns null if queue is empty
        System.out.println(queue.isEmpty());

        System.out.println();

        // Using Queue methods offer, poll, and element
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll()); // returns null if queue is empty

    }
}
