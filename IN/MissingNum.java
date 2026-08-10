public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int xorAll = 0;
        
        // 1. XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }
        
        // 2. XOR all elements present in the array
        for (int num : arr) {
            xorAll ^= num;
        }
        
        // The remaining value is the missing number
        return xorAll;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // 3 is missing, n = 5
        System.out.println("Missing Number: " + findMissing(arr, 5)); // Output: 3
    }
}
