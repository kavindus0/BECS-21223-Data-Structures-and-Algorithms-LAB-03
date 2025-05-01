package Q3;

public class Functions {

    public static int deleteMiddleDigit(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            System.out.println("Error: Input number cannot be negative.");
            return -1;
        }

        String numStr = Integer.toString(number);
        int len = numStr.length();
        int middleIndex = len / 2;

        Queue digitQueue = new Queue(len + 1);

        for (char c : numStr.toCharArray()) {
            digitQueue.append(c);
        }

        StringBuilder resultStr = new StringBuilder();
        int currentIndex = 0;
        while (!digitQueue.isQueueEmpty()) {
            char digit = digitQueue.serve();
            if (digit == '\0') {
                System.out.println("Error serving digit from queue.");
                return -1;
            }
            if (currentIndex != middleIndex) {
                resultStr.append(digit);
            }
            currentIndex++;
        }

        try {
            if (resultStr.length() == 0) {
                return 0;
            }
            return Integer.parseInt(resultStr.toString());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing result string back to integer: " + e.getMessage());
            return -1;
        }
    }
}
