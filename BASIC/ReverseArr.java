public void reverseArray(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

/*
Reverse String

public class StringReverseOptimized {
    public static String reverseInPlace(String str) {
        if (str == null || str.isEmpty()) return str;

        // Convert the string to a character array to allow modification
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Swap characters moving towards the center
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }

        // Convert back to string and return
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseInPlace("Hello World")); // Output: dlroW olleH
    }
}


    */
