package Q5;

public class Test {
    public static void main(String[] args) {
        int[] dataset = {10, 8, 7, 20, 15, 4};
        int maxSize = dataset.length;
        
        List myList = new List(maxSize);
        
        for (int item : dataset) {
            myList.insertLast(item);
        }
        
        System.out.println("Original List:");
        myList.traverseList();
        
        int secondLargest = Functions.findSecondLargest(myList);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest number: " + secondLargest);
        }
  
        List sortedList = Functions.sortDescending(myList);
        System.out.println("Descending order:");
        sortedList.traverseList();
    }
}