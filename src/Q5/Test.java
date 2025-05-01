package Q5;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the maximum size of the list:");
        int maxSize = scanner.nextInt();
        
        List myList = new List(maxSize);
        
        System.out.println("Enter the number of elements to add to the list:");
        int numElements = scanner.nextInt();
        
        if (numElements > maxSize) {
            System.out.println("Error: Number of elements cannot exceed the maximum size");
            scanner.close();
            return;
        }
        
        System.out.println("Enter " + numElements + " integers:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            myList.insertLast(element);
        }
        
        System.out.println("\nOriginal List:");
        myList.traverseList();
        
        int secondLargest = Functions.findSecondLargest(myList);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest number: " + secondLargest);
        }
  
        List sortedList = Functions.sortDescending(myList);
        System.out.println("Descending order:");
        sortedList.traverseList();
        
        scanner.close();
    }
}