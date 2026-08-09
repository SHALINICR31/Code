import java.util.HashMap;
import java.util.Map;
public class FibonacciMemoization {
  
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int getFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (memo.containsKey(n)) {
            return memo.get(n);//to save time (Time Optimization) and prevent the computer from freezing or crashing.
        }
        int result = getFibonacci(n - 1) + getFibonacci(n - 2);
        memo.put(n, result);   
        return result;
    }
    public static void main(String[] args) {
        int n = 45; 
        System.out.println("Fibonacci at index " + n + " is: " + getFibonacci(n));
      
    }
}

/*
To find 5, the computer calculates 4 and 3.But inside 4, the computer already calculates
  3 once.Indha code illana, the computer will recalculate 3 all over again from scratch.*/
