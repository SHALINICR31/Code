public class VowelConsonantStandard {
    public static void countVowelsAndConsonants(String str) {
        if (str == null) return;

        int vowels = 0;
        int consonants = 0;
        
        // Convert to lowercase to handle both 'A' and 'a' easily
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is an alphabet letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Hello World 2026!"); 
        // Output: Vowels: 3 (e, o, o), Consonants: 7 (h, l, l, w, r, l, d)
    }
}
