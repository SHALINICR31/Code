import java.util.Arrays;

public class EquilibriumIndex {
    public static int findEquilibrium(int[] arr) {
        // Calculate the total sum of all elements in the array
        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        long leftSum = 0;
        
        // Loop through each index to check for equilibrium
        for (int i = 0; i < arr.length; i++) {
            // totalSum - leftSum - arr[i] calculates the right side sum dynamically
            long rightSum = totalSum - leftSum - arr[i];
            
            if (leftSum == rightSum) {
                return i; // Found the equilibrium index
            }
            
            // Add current element to leftSum before moving to the next index
            leftSum += arr[i];
        }
        
        return -1; // Return -1 if no equilibrium index exists
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int result = findEquilibrium(arr);
        System.out.println("Equilibrium Index: " + result); 
        // Expected Output: 3
    }
}
