class Solution {
    double power(double b, int e) {
        if (e == 0) return 1.0; // Base case
        
        long exp = e;
        if (exp < 0) {
            b = 1.0 / b;
            exp = -exp;
        }
        
        double halfPower = power(b, (int)(exp / 2));
        
        // Exponent Even ah iruntha square, Odd ah iruntha extra * b
        return (exp % 2 == 0) ? halfPower * halfPower : b * halfPower * halfPower;
    }
}
