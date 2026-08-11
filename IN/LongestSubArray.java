public class LongestSubarray {
    public static int getLongestSubarray(int[] arr, int k) {
        int left = 0, right = 0;
        long currentSum = 0;
        int maxLen = 0;
        int n = arr.length;

        while (right < n) {
            currentSum += arr[right];

            // If currentSum exceeds k, shrink the window from the left
            while (left <= right && currentSum > k) {
                currentSum -= arr[left];
                left++;
            }

            // Check if we hit the exact target sum
            if (currentSum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}
// Example Input: arr = [2, 3, 5, 1, 9], k = 10
// Output: 4 (The subarray is [2, 3, 5, 1])
