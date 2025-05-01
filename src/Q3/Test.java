package Q3;

public class Test {

    public static void main(String[] args) {
        // Example input from Practical Tutorial 03, Problem 3
        int inputNumber = 12345;

        System.out.println("Input Number: " + inputNumber);

        // Call the function to delete the middle digit
        int resultNumber = Functions.deleteMiddleDigit(inputNumber);

        if (resultNumber != -1) { // Check if the function executed without error
            System.out.println("Number after deleting middle digit: " + resultNumber);
        } else {
            System.out.println("Function execution failed.");
        }

        // Test with an even digit number (e.g., 1234 -> 134)
        System.out.println("\n--- Testing with even digit number ---");
        int evenInput = 1234;
        System.out.println("Input Number: " + evenInput);
        int evenResult = Functions.deleteMiddleDigit(evenInput);
         if (evenResult != -1) {
            System.out.println("Number after deleting middle digit: " + evenResult);
        } else {
            System.out.println("Function execution failed.");
        }

         // Test with a single digit number (e.g., 5 -> 0)
        System.out.println("\n--- Testing with single digit number ---");
        int singleInput = 5;
        System.out.println("Input Number: " + singleInput);
        int singleResult = Functions.deleteMiddleDigit(singleInput);
         if (singleResult != -1) {
            System.out.println("Number after deleting middle digit: " + singleResult);
        } else {
            System.out.println("Function execution failed.");
        }

         // Test with zero
        System.out.println("\n--- Testing with zero ---");
        int zeroInput = 0;
        System.out.println("Input Number: " + zeroInput);
        int zeroResult = Functions.deleteMiddleDigit(zeroInput);
         if (zeroResult != -1) {
            System.out.println("Number after deleting middle digit: " + zeroResult);
        } else {
            System.out.println("Function execution failed.");
        }
    }
}
