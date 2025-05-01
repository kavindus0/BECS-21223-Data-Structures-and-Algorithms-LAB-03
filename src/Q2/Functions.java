package Q2;

public class Functions {

    public static Queue interleaveQueue(Queue inputQueue, int maxSize) {
        int size = inputQueue.queueSize();

        if (size % 2 != 0) {
            System.out.println("Error: Input queue size must be even for interleaving.");
            return null;
        }

        if (size == 0) {
            return new Queue(maxSize);
        }

        int[] tempArray = new int[size];
        int index = 0;
        while (!inputQueue.isQueueEmpty()) {
            int element = inputQueue.serve();
            if (element != -1) {
                tempArray[index++] = element;
            } else {
                System.out.println("Error serving element during interleaving process.");
                return null;
            }
        }

        Queue resultQueue = new Queue(maxSize);
        int midPoint = size / 2;

        for (int i = 0; i < midPoint; i++) {
            resultQueue.append(tempArray[i]);
            resultQueue.append(tempArray[i + midPoint]);
        }

        return resultQueue;
    }
}
