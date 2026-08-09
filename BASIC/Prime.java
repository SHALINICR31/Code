public class PrimeOptimized {
    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;

        // Loop stops at the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeOptimized(1000003)); // true (Runs only ~1000 times instead of 1 million!)
    }
}
/*


public class PrimeUltimate {
    public static boolean isPrimeUltimate(int n) {
        // Base cases
        if (n <= 1) return false;
        if (n <= 3) return true; // 2 and 3 are prime

        // Skip all even numbers and multiples of 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check factors up to sqrt(n), skipping multiples of 2 and 3
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeUltimate(97)); // true
    }
}


*/
