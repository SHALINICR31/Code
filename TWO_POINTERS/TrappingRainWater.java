public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        // Two Pointers scanning inward toward the middle
        while (left < right) {
            // Processing from the left side if the left wall is shorter
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    // Update the running left boundary peak
                    leftMax = height[left];
                } else {
                    // Water is trapped because current height is smaller than leftMax
                    totalWater += leftMax - height[left];
                }
                left++;
            } 
            // Processing from the right side if the right wall is shorter
            else {
                if (height[right] >= rightMax) {
                    // Update the running right boundary peak
                    rightMax = height[right];
                } else {
                    // Water is trapped because current height is smaller than rightMax
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        // Sample input array representing pillar heights
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        
        int result = trap(height);
        System.out.println("🌧️ Total units of trapped rainwater: " + result);
    }
}
