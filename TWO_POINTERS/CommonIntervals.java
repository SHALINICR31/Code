import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {
    public static int[][] findCommonIntervals(int[][] A, int[][] B) {
        // Edge case check for empty inputs
        if (A == null || A.length == 0 || B == null || B.length == 0) {
            return new int[0][0];
        }

        List<int[]> resultList = new ArrayList<>();
        int i = 0; // Pointer for array A
        int j = 0; // Pointer for array B

        // Loop until you reach the end of either list
        while (i < A.length && j < B.length) {
            // 1. Calculate the overlapping boundaries
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);

            // 2. If it's a valid intersection, store it
            if (start <= end) {
                resultList.add(new int[]{start, end});
            }

            // 3. Move the pointer of the interval that finishes earlier
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert the dynamic list back into a primitive 2D array
        return resultList.toArray(new int[resultList.size()][]);
    }

    // Driver method to test the logic
    public static void main(String[] args) {
        int[][] A = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] B = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};

        int[][] common = findCommonIntervals(A, B);

        // Print output array
        System.out.print("[");
        for (int k = 0; k < common.length; k++) {
            System.out.print("[" + common[k][0] + ", " + common[k][1] + "]");
            if (k < common.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
