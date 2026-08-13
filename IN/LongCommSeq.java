import java.util.Arrays;

public class EasyLCS {
    public static int findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        
        int[][] dp = new int[m + 1][n + 1];


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
              
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // Diagonal + 1
                } 
                
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Top vs Left (Max value)
                }
            }
        }
        

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
