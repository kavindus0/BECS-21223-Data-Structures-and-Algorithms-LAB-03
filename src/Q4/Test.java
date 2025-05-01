package Q4;

public class Test {
    public static void main(String[] args) {
        int[] dataset = {10, 9, 52, 24, 35, 11, 9, 12, 3, 11, 25, 24, 8, 11, 42};
        int maxSize = dataset.length;
        
        List dataList = new List(maxSize);
        
        for (int item : dataset) {
            dataList.insertLast(item);
        }
        
        System.out.println("Dataset:");
        dataList.traverseList();
        
        double mean = Functions.calculateMean(dataList);
        double median = Functions.calculateMedian(dataList);
        int mode = Functions.calculateMode(dataList);
        int range = Functions.calculateRange(dataList);
        
        System.out.printf("Mean: %.6f\n", mean);
        System.out.printf("Median: %.1f\n", median);
        System.out.println("Mode: " + mode);
        System.out.println("Range: " + range);
    }
}