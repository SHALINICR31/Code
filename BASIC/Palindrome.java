public class NumberPalindrome {
    public static boolean isNumberPalindrome(int number) {
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        if (number < 0) return false;
        
        // Single digits are always palindromes
        if (number < 10) return true;

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(121));  // true
        System.out.println(isNumberPalindrome(1234)); // false
    }
}
