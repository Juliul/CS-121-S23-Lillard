package AssignWeek13;

public class LinkedListQueue {
    // inner class Node
    private class Node
    {
        public Object data;
        public Node next;
        public Node(Object data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    // add item to queue
    public void enqueue(Object item)
    {
        Node newNode = new Node(item, null);
        // if queue is empty, new node becomes the head
        if (isEmpty())
        {
            head = newNode;
        }
        // else the tail becomes the new node
        else
        {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Object dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        // get the element at the head
        Object item = head.data;
        // if the head is the tail (only one item in queue),
        // set its value to null
        if (tail == head)
        {
            tail = null;
        }
        // set the new head to the next in line
        head = head.next;
        return item;
    }
    public Object peek() {
        if (head == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        return head.data;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public int size()
    {
        int count = 0;
        for (Node node = head; node != null; node = node.next)
        {
            count++;
        }
        return count;
    }
    public String displayQueue() {
        String queueElements = "";
        for (Node node = head; node != null; node = node.next) {
            queueElements += String.format("%s%n", node.data);
        }
        return queueElements;
    }
}
