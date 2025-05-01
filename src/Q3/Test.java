package Q3;

public class Test {

    public static void main(String[] args) {
        int inputNumber = 12345;

        System.out.println("Input Number: " + inputNumber);

        int resultNumber = Functions.deleteMiddleDigit(inputNumber);

        if (resultNumber != -1) {
            System.out.println("Number after deleting middle digit: " + resultNumber);
        } else {
            System.out.println("Function execution failed.");
        }

        System.out.println("\n--- Testing with even digit number ---");
        int evenInput = 1234;
        System.out.println("Input Number: " + evenInput);
        int evenResult = Functions.deleteMiddleDigit(evenInput);
         if (evenResult != -1) {
            System.out.println("Number after deleting middle digit: " + evenResult);
        } else {
            System.out.println("Function execution failed.");
        }

        System.out.println("\n--- Testing with single digit number ---");
        int singleInput = 5;
        System.out.println("Input Number: " + singleInput);
        int singleResult = Functions.deleteMiddleDigit(singleInput);
         if (singleResult != -1) {
            System.out.println("Number after deleting middle digit: " + singleResult);
        } else {
            System.out.println("Function execution failed.");
        }

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
