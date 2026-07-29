import java.util.Arrays;

public class TwoSumTwoPointer {
    public static int[] twoSumSorted(int[] nums, int target) {
   
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int currentSum = nums[left] + nums[right];

        
            if (currentSum == target) {
                return new int[] { left, right };
            }
            
            else if (currentSum < target) {
                left++;
            } 

            else {
                right--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; 
        int target = 9;

        int[] result = twoSumSorted(nums, target);

        if (result.length == 2) {
            System.out.println(" Pair found at indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("The numbers are: " + nums[result[0]] + " and " + nums[result[1]]);
        } else {
            System.out.println(" No matching pair found.");
        }
    }
}
