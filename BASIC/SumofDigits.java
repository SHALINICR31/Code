public class SumOfDigitsStandard {
    public static int getSum(int number) {
        // Handle negative numbers by converting them to positive
        number = Math.abs(number);
        
        int sum = 0;
        
        while (number > 0) {
            sum += number % 10; // Extract the last digit and add to sum
            number /= 10;       // Remove the last digit from the number
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(12345)); // Output: 15 (1+2+3+4+5)
        System.out.println(getSum(-98));   // Output: 17 (9+8)
    }
}
