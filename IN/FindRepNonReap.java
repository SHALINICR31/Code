import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int repeated = 0;
        int nonRepeated = 0;

        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                repeated++;
            } else {
                nonRepeated++;
            }
        }

        System.out.println("Repeated elements count: " + repeated);
        System.out.println("Non-repeated elements count: " + nonRepeated);
    }
}
