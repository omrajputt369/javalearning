/**
 * A Java program demonstrating common Bit Manipulation techniques.
 */

public class BitManipulationDemo {
    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int pos = 1;

        System.out.println("Original Number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");

        // 1. Get Bit
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("Bit at position " + pos + " is 0");
        } else {
            System.out.println("Bit at position " + pos + " is 1");
        }

        // 2. Set Bit
        int setBitNumber = bitMask | n;
        System.out.println("After setting bit at " + pos + ": " + setBitNumber + " (Binary: "
                + Integer.toBinaryString(setBitNumber) + ")");

        // 3. Clear Bit
        int newBitMask = ~(bitMask);
        int clearBitNumber = newBitMask & n;
        System.out.println("After clearing bit at " + pos + ": " + clearBitNumber + " (Binary: "
                + Integer.toBinaryString(clearBitNumber) + ")");

        // 4. Update Bit (Example: update bit at pos 1 to 1)
        int updateVal = 1;
        int updateBitMask = ~(1 << pos);
        int updatedNumber = (updateBitMask & n) | (updateVal << pos);
        System.out.println("After updating bit at " + pos + " to 1: " + updatedNumber + " (Binary: "
                + Integer.toBinaryString(updatedNumber) + ")");

        // 5. Check if Power of Two
        int num = 8;
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println("Is " + num + " a power of two? " + isPowerOfTwo);
    }
}
