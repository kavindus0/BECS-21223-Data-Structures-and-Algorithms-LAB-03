package Q1;

public class Test {

    public static void main(String[] args) {
        int[] inputData = {10, 20, 10, 10, 30, 40, 50, 40, 50, 50, 10, 20, 20};
        int maxSize = 20;

        Queue myQueue = new Queue(maxSize);
        System.out.println("Appending elements:");
        for (int item : inputData) {
            myQueue.append(item);
        }

        System.out.println("\nOriginal Queue:");
        myQueue.display();
        System.out.println("Original Queue Size: " + myQueue.queueSize());

        Queue uniqueQueue = Functions.removeDuplicates(myQueue, maxSize);

        System.out.println("\nQueue after removing duplicates:");
        uniqueQueue.display();
        System.out.println("Unique Queue Size: " + uniqueQueue.queueSize());
    }
}
