package Week13;
import java.util.LinkedList;
public class LinkedListQueueTester {
    public static void main(String[] args) {
        //1.
        LinkedListQueue object = new LinkedListQueue();
        System.out.println(object.displayQueue());
        //2.
        System.out.println("-----------------");
        object.enqueue("John");
        object.enqueue("Mary");
        System.out.println(object.displayQueue());
        System.out.println("-----------------");
        //3.
        System.out.println("-----------------");
        System.out.println("Queue is empty" + object.isEmpty());
        System.out.println("Number of items in queue: " + object.size());
        System.out.println("The head of the queue is: " + object.peek());
        System.out.println("Remove Tom");
        object.dequeue();
        System.out.println("-----------------");

        //4.
        System.out.println("-----------------");
        System.out.println(object.displayQueue());
        System.out.println("-----------------");

        //5.
        System.out.println("-----------------");
        System.out.println("Queue is empty" + object.isEmpty());
        System.out.println("Number of items in queue: " + object.size());
        System.out.println("The head of the queue is: " + object.peek());
        System.out.println("-----------------");
        //6.
        System.out.println("-----------------");
        System.out.println("Remove Jane");
        object.dequeue();
        System.out.println("The head of the queue is: " + object.peek());
        System.out.println("-----------------");
        //7.
        System.out.println("-----------------");
        System.out.println("Remove Beth");
        object.dequeue();
        System.out.println("The head of the queue is: " + object.peek());
        System.out.println("-----------------");
        //8.
        System.out.println("-----------------");
        System.out.println("Remove John");
        object.dequeue();
        System.out.println("The head of the queue is: " + object.peek());
        System.out.println("-----------------");
        //9.
        System.out.println("-----------------");
        System.out.println("Remove Mary");
        object.dequeue();
        System.out.println("The head of the queue is: " + object.peek());
        System.out.println("-----------------");
        //10.
        System.out.println("-----------------");
        System.out.println("Queue is empty: " + object.isEmpty());
        System.out.println("-----------------");
    }
}
