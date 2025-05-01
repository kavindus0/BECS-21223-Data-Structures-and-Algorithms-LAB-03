package Q2; // Changed package name

// Implementation based on lecture slides (pages 44-49)
// Copied from Q1/Queue.java
public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int count;

    // Constructor (Slide 44)
    public Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Check if the queue is empty (Slide 45)
    public boolean isQueueEmpty() {
        return (count == 0);
    }

    // Check if the queue is full (Slide 46)
    public boolean isQueueFull() {
        return (count == maxSize);
    }

    // Add an item to the rear of the queue (Slide 47)
    public void append(int item) {
        if (isQueueFull()) {
            System.out.println("Error: Queue is Full. Cannot append " + item);
        } else {
            // System.out.println("Inserting " + item); // Optional: for debugging
            rear = (rear + 1) % maxSize; // Move rear circularly
            queue[rear] = item;
            count++;
        }
    }

    // Remove and return the item from the front of the queue (Slide 48)
    public int serve() {
        if (isQueueEmpty()) {
            System.out.println("Error: Queue is Empty. Cannot serve.");
            // Returning 0 or throwing an exception might be better,
            // but following slide's print statement for now.
            return -1; // Indicate error or empty queue
        } else {
            int item = queue[front];
            front = (front + 1) % maxSize; // Move front circularly
            count--;
            return item;
        }
    }

    // Get the current number of items in the queue (Slide 49)
    public int queueSize() {
        return count;
    }

    // Helper method to display queue contents (for testing)
    public void display() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front to rear): [");
        int current = front;
        for (int i = 0; i < count; i++) {
            System.out.print(queue[current]);
            if (i < count - 1) {
                System.out.print(", ");
            }
            current = (current + 1) % maxSize;
        }
        System.out.println("]");
    }
}
