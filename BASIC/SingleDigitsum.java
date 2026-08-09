38 \(\rightarrow \) 3 + 8 = 11 \(\rightarrow \) 1 + 1 = 2. The single digit sum is 2


  public class DigitalRoot {
    public static int getSingleDigitSum(int num) {
        if (num == 0) return 0;
        
        // Mathematical shortcut formula
        if (num % 9 == 0) return 9;
        return num % 9;
        
        // Even shorter line alternative: return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(getSingleDigitSum(38));   // Output: 2
        System.out.println(getSingleDigitSum(9999)); // Output: 9
    }
}
