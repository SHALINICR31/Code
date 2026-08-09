public class ArmstrongStandard {
    public static boolean isArmstrong(int number) {
        int temp = number;
        int digits = 0;
        int sum = 0;
        // Step 1: Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits); // Math.pow returns a double
            temp /= 10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));  // true
        System.out.println(isArmstrong(1634)); // true
        System.out.println(isArmstrong(123));  // false
    }
}
