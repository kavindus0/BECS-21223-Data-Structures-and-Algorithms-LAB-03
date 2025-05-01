package Q1;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int count;

    public Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isQueueEmpty() {
        return (count == 0);
    }

    public boolean isQueueFull() {
        return (count == maxSize);
    }

    public void append(int item) {
        if (isQueueFull()) {
            System.out.println("Error: Queue is Full. Cannot append " + item);
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = item;
            count++;
        }
    }

    public int serve() {
        if (isQueueEmpty()) {
            System.out.println("Error: Queue is Empty. Cannot serve.");
            return -1;
        } else {
            int item = queue[front];
            front = (front + 1) % maxSize;
            count--;
            return item;
        }
    }

    public int queueSize() {
        return count;
    }

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
