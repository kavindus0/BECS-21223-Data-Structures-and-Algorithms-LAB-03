package Q1;

public class Test {

    public static void main(String[] args) {
        // Example input from Practical Tutorial 03, Problem 1
        int[] inputData = {10, 20, 10, 10, 30, 40, 50, 40, 50, 50, 10, 20, 20};
        int maxSize = 20; // Choose a size large enough for input and potential operations

        // Create and populate the initial queue
        Queue myQueue = new Queue(maxSize);
        System.out.println("Appending elements:");
        for (int item : inputData) {
            // System.out.println("Appending: " + item); // Optional: for debugging append
            myQueue.append(item);
        }

        System.out.println("\nOriginal Queue:");
        myQueue.display();
        System.out.println("Original Queue Size: " + myQueue.queueSize());

        // Remove duplicates
        // Note: removeDuplicates empties the original queue as per its implementation
        Queue uniqueQueue = Functions.removeDuplicates(myQueue, maxSize);

        System.out.println("\nQueue after removing duplicates:");
        uniqueQueue.display();
        System.out.println("Unique Queue Size: " + uniqueQueue.queueSize());

        // Verify original queue is now empty (as per removeDuplicates implementation)
        // System.out.println("\nOriginal Queue after processing:");
        // myQueue.display();
        // System.out.println("Original Queue Size after processing: " + myQueue.queueSize());
    }
}
