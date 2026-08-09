public class FactorialRecursive {
    public static int getFactorial(int n) {
        if (n <= 1) return 1; // Base case
        return n * getFactorial(n - 1); // Recursive call
    }



  if (n < 0) return -1; // Error handler for invalid input
        
        long result = 1;
        // Loop from 2 up to n
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getFactorial(5)); // Output: 120
    }
}
