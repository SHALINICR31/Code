Input:  "swiss"
Output: "w"

  import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}
