public class MaxMinStandard {
    public static void findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int max = arr[0];
        int min = arr[0];

        // Loop through the rest of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) { 
                min = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 9, 2, 8};
        findMaxMin(numbers);
    }
}
