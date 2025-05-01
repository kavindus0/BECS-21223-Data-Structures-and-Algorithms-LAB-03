package Q4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Functions {

    public static double calculateMean(List list) {
        if (list.isListEmpty()) {
            System.out.println("Cannot calculate mean of an empty list.");
            return Double.NaN;
        }
        double sum = 0;
        int size = list.listSize();
        for (int i = 0; i < size; i++) {
            sum += list.retrieveList(i);
        }
        return sum / size;
    }

    public static double calculateMedian(List list) {
        if (list.isListEmpty()) {
            System.out.println("Cannot calculate median of an empty list.");
            return Double.NaN;
        }
        int[] sortedArray = list.getInternalArrayCopy();
        Arrays.sort(sortedArray);

        int size = sortedArray.length;
        if (size % 2 != 0) {
            return sortedArray[size / 2];
        } else {
            int mid1 = sortedArray[size / 2 - 1];
            int mid2 = sortedArray[size / 2];
            return (double) (mid1 + mid2) / 2.0;
        }
    }

    public static int calculateMode(List list) {
        if (list.isListEmpty()) {
            System.out.println("Cannot calculate mode of an empty list.");
            return Integer.MIN_VALUE;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int size = list.listSize();
        int maxFrequency = 0;
        int mode = list.retrieveList(0);

        for (int i = 0; i < size; i++) {
            int element = list.retrieveList(i);
            int frequency = frequencyMap.getOrDefault(element, 0) + 1;
            frequencyMap.put(element, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = element;
            }
        }
        return mode;
    }

    public static int calculateRange(List list) {
        if (list.isListEmpty() || list.listSize() == 1) {
             System.out.println("Cannot calculate range for lists with 0 or 1 element.");
            return -1;
        }

        int min = list.retrieveList(0);
        int max = list.retrieveList(0);
        int size = list.listSize();

        for (int i = 1; i < size; i++) {
            int element = list.retrieveList(i);
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        return max - min;
    }
}
