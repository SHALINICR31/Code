public class SwapBitwise {
    public static void main(String[] args) {
        int a = 10; // Binary: 1010
        int b = 20; // Binary: 10100

        a = a ^ b; // Step 1
        b = a ^ b; // Step 2: 'b' now holds original 'a'
        a = a ^ b; // Step 3: 'a' now holds original 'b'

        System.out.println("a: " + a + ", b: " + b); // Output: a: 20, b: 10




      a = a + b; // Step 1: Combine both values (a = 10 + 20 = 30)
        b = a - b; // Step 2: Extract original 'a' into 'b' (b = 30 - 20 = 10)
        a = a - b; // Step 3: Extract original 'b' into 'a' (a = 30 - 10 = 20)

      
      int temp = a; // temp = 10
        // Step 2: Overwrite a with b value
        a = b;        // a = 20
        // Step 3: Put temp value into b
        b = temp;     // b = 10
    }
}
