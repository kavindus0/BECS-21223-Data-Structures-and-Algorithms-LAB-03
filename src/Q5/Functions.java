package Q5;

public class Functions {
    
    public static int findSecondLargest(List list) {
        if (list.isListEmpty() || list.listSize() < 2) {
            System.out.println("Error: List must contain at least two elements");
            return Integer.MIN_VALUE;
        }
        
        int largest = list.retrieveList(0);
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 1; i < list.listSize(); i++) {
            int current = list.retrieveList(i);
            
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Error: All elements in the list are identical");
            return Integer.MIN_VALUE;
        }
        
        return secondLargest;
    }
    
    public static List sortDescending(List originalList) {
        if (originalList.isListEmpty()) {
            return new List(0);
        }
        
        List sortedList = new List(originalList.listSize());
        int[] elements = originalList.getInternalArrayCopy();
        
        bubbleSort(elements);
        
        for (int element : elements) {
            sortedList.insertLast(element);
        }
        
        return sortedList;
    }
    
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}