public class UniqueElement {
    public static int findUnique(int[] arr) {
        int xorSum = 0;
        for (int num : arr) {
            xorSum ^= num; // XORing every element
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        // Process: 0 ^ 4 ^ 1 ^ 2 ^ 1 ^ 2 
        // Rearranged: (1 ^ 1) ^ (2 ^ 2) ^ 4 -> 0 ^ 0 ^ 4 = 4
        System.out.println("Unique Element: " + findUnique(arr)); // Output: 4
    }
}
