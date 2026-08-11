import java.util.Arrays;

public class EasyLCS {
    public static int findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        // 1. எளிமையாக ஒரு 2D Matrix (டேபிள்) உருவாக்குகிறோம்
        int[][] dp = new int[m + 1][n + 1];

        // 2. இரண்டு லூப்களைப் பயன்படுத்தி டேபிளை நிரப்புகிறோம்
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                // எழுத்துக்கள் ஒன்றாக இருந்தால் (Match)
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // Diagonal + 1
                } 
                // எழுத்துக்கள் வேறாக இருந்தால் (Mismatch)
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Top vs Left (Max value)
                }
            }
        }
        
        // 3. டேபிளின் கடைசி மூலையில் இருக்கும் இறுதி விடையை அனுப்புகிறோம்
        return dp[m][n];
    }

    public static void main(String[] args) {
        // IP (Input)
        String s1 = "abcde";
        String s2 = "ace";
        
        // OP (Output)
        System.out.println("LCS Length: " + findLCS(s1, s2)); // Output: 3
    }
}
