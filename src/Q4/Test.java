package Q4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the maximum size of the list:");
        int maxSize = scanner.nextInt();
        
        List dataList = new List(maxSize);
        
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
            dataList.insertLast(element);
        }
        
        System.out.println("\nOriginal Dataset:");
        dataList.traverseList();
        
        // Calculate and display statistics
        double mean = Functions.calculateMean(dataList);
        double median = Functions.calculateMedian(dataList);
        int mode = Functions.calculateMode(dataList);
        int range = Functions.calculateRange(dataList);
        
        System.out.println("\nStatistical Analysis:");
        System.out.printf("Mean: %.6f\n", mean);
        System.out.printf("Median: %.1f\n", median);
        System.out.println("Mode: " + mode);
        System.out.println("Range: " + range);
        
        scanner.close();
    }
}