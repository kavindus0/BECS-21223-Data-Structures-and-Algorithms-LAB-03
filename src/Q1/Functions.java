package Q1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Functions {

    /**
     * Removes duplicate elements from a custom Queue while preserving the order
     * of the first occurrence of each element.
     *
     * @param inputQueue The input Queue potentially containing duplicates.
     *                   This queue will be emptied during the process.
     * @param maxSize    The maximum size for the new queue (should be at least
     *                   the number of unique elements).
     * @return A new Queue containing only the unique elements from the inputQueue,
     *         in their original order.
     */
    public static Queue removeDuplicates(Queue inputQueue, int maxSize) {
        // Use LinkedHashSet to store unique elements while preserving order
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        Queue tempStorage = new Queue(maxSize); // Temporary queue to hold elements

        // Serve all elements from inputQueue and add unique ones to the set
        // Also store them temporarily to rebuild the original queue if needed,
        // or just to process them.
        while (!inputQueue.isQueueEmpty()) {
            int element = inputQueue.serve();
            if (element != -1) { // Check if serve was successful
                 uniqueElements.add(element);
                 tempStorage.append(element); // Store served element temporarily
            }
        }

        // Re-populate the original input queue from temp storage (optional, depends if modification is allowed)
        // For this problem, we just need the unique ones for the result.
        // while(!tempStorage.isQueueEmpty()){
        //     inputQueue.append(tempStorage.serve());
        // }


        // Create the result queue with unique elements from the set
        Queue resultQueue = new Queue(maxSize); // Use maxSize for safety, could use uniqueElements.size()
        for (int uniqueElement : uniqueElements) {
            resultQueue.append(uniqueElement);
        }

        return resultQueue;
    }
}
