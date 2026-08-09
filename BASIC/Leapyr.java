public class LeapYearOptimized {
    public static boolean isLeapYearOptimized(int year) {
        // Condition: (Divisible by 4 AND NOT divisible by 100) OR (Divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYearOptimized(2026)); // false
        System.out.println(isLeapYearOptimized(2400)); // true
    }
}
