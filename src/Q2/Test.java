package Q2;

public class Test {

    public static void main(String[] args) {
        int[] inputData = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int maxSize = 20;

        Queue myQueue = new Queue(maxSize);
        System.out.println("Appending elements:");
        for (int item : inputData) {
            myQueue.append(item);
        }

        System.out.println("\nOriginal Queue:");
        myQueue.display();
        System.out.println("Original Queue Size: " + myQueue.queueSize());

        Queue interleavedQueue = Functions.interleaveQueue(myQueue, maxSize);

        if (interleavedQueue != null) {
            System.out.println("\nQueue after interleaving:");
            interleavedQueue.display();
            System.out.println("Interleaved Queue Size: " + interleavedQueue.queueSize());
        } else {
            System.out.println("\nInterleaving failed (e.g., queue size was not even).");
        }

        System.out.println("\n--- Testing with odd-sized queue ---");
        int[] oddData = {1, 2, 3, 4, 5};
        Queue oddQueue = new Queue(maxSize);
        for (int item : oddData) {
            oddQueue.append(item);
        }
        System.out.println("Original Odd Queue:");
        oddQueue.display();
        Queue resultOdd = Functions.interleaveQueue(oddQueue, maxSize);
        if (resultOdd == null) {
            System.out.println("Interleaving correctly failed for odd-sized queue.");
        } else {
             System.out.println("Error: Interleaving should have failed for odd size.");
             resultOdd.display();
        }
    }
}
