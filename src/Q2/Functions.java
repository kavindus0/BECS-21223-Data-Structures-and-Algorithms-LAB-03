package Q2;

public class Functions {

    /**
     * Rearranges the elements of an even-length queue by interleaving the first
     * and second halves.
     * Example: [10, 20, 30, 40, 50, 60] -> [10, 40, 20, 50, 30, 60]
     *
     * @param inputQueue The input Queue. It must have an even number of elements.
     *                   This queue will be emptied during the process.
     * @param maxSize    The maximum size for the new queue.
     * @return A new Queue with interleaved elements, or null if the input queue
     *         size is not even or if an error occurs.
     */
    public static Queue interleaveQueue(Queue inputQueue, int maxSize) {
        int size = inputQueue.queueSize();

        // Check if the queue size is even
        if (size % 2 != 0) {
            System.out.println("Error: Input queue size must be even for interleaving.");
            // Optionally, restore the input queue if needed, but for now, return null
            // We could create a temp queue first, copy, then restore if invalid.
            return null;
        }

        if (size == 0) {
            return new Queue(maxSize); // Return an empty queue if input is empty
        }

        // Temporary storage using a basic array
        int[] tempArray = new int[size];
        int index = 0;
        while (!inputQueue.isQueueEmpty()) {
            int element = inputQueue.serve();
            if (element != -1) { // Check serve success
                tempArray[index++] = element;
            } else {
                System.out.println("Error serving element during interleaving process.");
                return null; // Error occurred during serving
            }
        }

        // Create the result queue
        Queue resultQueue = new Queue(maxSize);
        int midPoint = size / 2;

        // Interleave elements from the first and second halves
        for (int i = 0; i < midPoint; i++) {
            resultQueue.append(tempArray[i]);        // Element from first half
            resultQueue.append(tempArray[i + midPoint]); // Element from second half
        }

        return resultQueue;
    }
}
