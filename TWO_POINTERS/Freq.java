import java.util.Scanner;

public class PureStreamTracker {
    public static void findHighFrequencyNumbers(String sortedInput, int targetFrequency) {
        Scanner scanner = new Scanner(sortedInput);
        
        // Edge case: handle completely empty input strings safely
        if (!scanner.hasNextInt()) {
            System.out.println("No input numbers provided.");
            scanner.close();
            return;
        }

        // Initialize primitive state tracking variables
        int currentNum = scanner.nextInt();
        int currentCount = 1;
        boolean foundAny = false;

        System.out.print("Numbers appearing strictly more than " + targetFrequency + " times: ");

        // Process the rest of the stream token by token
        while (scanner.hasNextInt()) {
            int nextNum = scanner.nextInt();

            if (nextNum == currentNum) {
                // If it is the same number, increment the sequential counter
                currentCount++;
            } else {
                // Number changed! First, evaluate the completed number group
                if (currentCount > targetFrequency) {
                    System.out.print(currentNum + " ");
                    foundAny = true;
                }
                // Reset tracking registers for the next number group
                currentNum = nextNum;
                currentCount = 1;
            }
        }

        // Evaluate the very last number group remaining in the stream registers
        if (currentCount > targetFrequency) {
            System.out.print(currentNum + " ");
            foundAny = true;
        }

        if (!foundAny) {
            System.out.print("None");
        }
        System.out.println();
        scanner.close();
    }

    public static void main(String[] args) {
        String input = "1 1 2 2 2 2 5 6";
        int givenFrequency = 1; // Threshold value to cross

        findHighFrequencyNumbers(input, givenFrequency);
    }
}
