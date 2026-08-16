class Solution {
     static int closestNumber(int n, int m) {
        int q = n / m;
        int n1 = m * q;
        int n2 = (n * m > 0) ? (m * (q + 1)) : (m * (q - 1));

        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        }
        if (Math.abs(n - n2) < Math.abs(n - n1)) {
            return n2;
        }

        return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
    }
}
