package Q3;

public class Functions {

    /**
     * Deletes the middle digit of a given integer.
     * If the number has an even number of digits, the digit just before
     * the exact center is considered the "middle" (e.g., in 1234, '2' is removed).
     * Uses a custom Queue to process digits.
     *
     * @param number The input integer.
     * @return The integer with the middle digit removed, or -1 if an error occurs
     *         (e.g., input is negative, parsing error). Returns 0 for input 0.
     */
    public static int deleteMiddleDigit(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            System.out.println("Error: Input number cannot be negative.");
            return -1; // Or handle negative numbers differently if required
        }

        String numStr = Integer.toString(number);
        int len = numStr.length();
        int middleIndex = len / 2; // Integer division gives the correct index to remove

        // Use the custom Queue for characters
        Queue digitQueue = new Queue(len + 1); // Size needs to be sufficient

        // Append digits to the queue
        for (char c : numStr.toCharArray()) {
            digitQueue.append(c);
        }

        // Build the result string by serving from the queue and skipping the middle digit
        StringBuilder resultStr = new StringBuilder();
        int currentIndex = 0;
        while (!digitQueue.isQueueEmpty()) {
            char digit = digitQueue.serve();
            if (digit == '\0') { // Check for serve error
                System.out.println("Error serving digit from queue.");
                return -1;
            }
            // Append only if it's not the middle digit
            if (currentIndex != middleIndex) {
                resultStr.append(digit);
            }
            currentIndex++;
        }

        // Convert the result string back to an integer
        try {
            if (resultStr.length() == 0) {
                return 0; // Should only happen if input was a single digit
            }
            return Integer.parseInt(resultStr.toString());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing result string back to integer: " + e.getMessage());
            return -1;
        }
    }
}
