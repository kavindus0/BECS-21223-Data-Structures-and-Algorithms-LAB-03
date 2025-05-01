package Q3; // Changed package name

// Implementation based on lecture slides (pages 44-49)
// Copied from Q2/Queue.java
public class Queue {
    // Using Character queue now, need to adjust internal array type
    private char[] queue; // Changed from int[] to char[]
    private int front;
    private int rear;
    private int maxSize;
    private int count;

    // Constructor (Slide 44) - adjusted for char
    public Queue(int size) {
        maxSize = size;
        queue = new char[maxSize]; // Changed from int[] to char[]
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

    // Add an item to the rear of the queue (Slide 47) - adjusted for char
    public void append(char item) { // Changed from int to char
        if (isQueueFull()) {
            System.out.println("Error: Queue is Full. Cannot append " + item);
        } else {
            rear = (rear + 1) % maxSize; // Move rear circularly
            queue[rear] = item;
            count++;
        }
    }

    // Remove and return the item from the front of the queue (Slide 48) - adjusted for char
    public char serve() { // Changed from int to char
        if (isQueueEmpty()) {
            System.out.println("Error: Queue is Empty. Cannot serve.");
            // Returning a special character or throwing an exception might be better.
            return '\0'; // Indicate error or empty queue (null character)
        } else {
            char item = queue[front]; // Changed from int to char
            front = (front + 1) % maxSize; // Move front circularly
            count--;
            return item;
        }
    }

    // Get the current number of items in the queue (Slide 49)
    public int queueSize() {
        return count;
    }

    // Helper method to display queue contents (for testing) - adjusted for char
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
