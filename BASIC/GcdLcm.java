public class GcdLcmOptimized {

    // 1. Highly Optimized GCD using Euclid's Algorithm (Time Complexity: O(log(min(a,b))))
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Get the remainder
            a = temp;  // Swap
        }
        return a;
    }

    // 2. LCM using the formula: (a * b) / GCD
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        
        // Optimization Trick: Divide first before multiplying to prevent Integer Overflow!
        return (a / findGCD(a, b)) * b;
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("GCD (HCF): " + gcd); // Output: 6
        System.out.println("LCM: " + lcm);       // Output: 36
    }
}
