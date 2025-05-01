package Q1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Functions {

    public static Queue removeDuplicates(Queue inputQueue, int maxSize) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        Queue tempStorage = new Queue(maxSize);

        while (!inputQueue.isQueueEmpty()) {
            int element = inputQueue.serve();
            if (element != -1) {
                 uniqueElements.add(element);
                 tempStorage.append(element);
            }
        }

        Queue resultQueue = new Queue(maxSize);
        for (int uniqueElement : uniqueElements) {
            resultQueue.append(uniqueElement);
        }

        return resultQueue;
    }
}
