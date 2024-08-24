/**
 * The o8_Bit class provides methods for performing various bitwise operations
 * on integers. These operations include checking, setting, clearing, and
 * toggling a specific bit in a given integer.
 */
public class o8_Bit {

    /**
     * Checks whether the bit at the specified position in the given number is set to 1.
     *
     * @param n    The integer number to check.
     * @param pos  The position of the bit to check (1-based index).
     * @return     1 if the bit at the specified position is 1, otherwise 0.
     */
    static int getBit(int n, int pos) {
        // Shift 1 left by (pos - 1) positions and perform a bitwise AND with 'n'
        // If the result is not 0, the bit at position 'pos' is 1
        if ((n & 1 << (pos - 1)) != 0) {
            return 1;
        }
        return 0;
    }

    /**
     * Sets the bit at the specified position in the given number to 1.
     *
     * @param n    The integer number to modify.
     * @param pos  The position of the bit to set (1-based index).
     * @return     The modified number with the bit at the specified position set to 1.
     */
    static int setBit(int n, int pos) {
        // Shift 1 left by (pos - 1) positions and perform a bitwise OR with 'n'
        // This sets the bit at position 'pos' to 1
        return (n | 1 << (pos - 1));
    }

    /**
     * Clears (sets to 0) the bit at the specified position in the given number.
     *
     * @param n    The integer number to modify.
     * @param pos  The position of the bit to clear (1-based index).
     * @return     The modified number with the bit at the specified position cleared to 0.
     */
    static int clearBit(int n, int pos) {
        // Shift 1 left by (pos - 1) positions, then negate it to create a mask
        // Perform a bitwise AND with 'n' to clear the bit at position 'pos'
        return (n & ~(1 << (pos - 1)));
    }

    /**
     * Toggles (alters) the bit at the specified position in the given number.
     * If the bit is 1, it is cleared to 0. If the bit is 0, it is set to 1.
     *
     * @param n    The integer number to modify.
     * @param pos  The position of the bit to toggle (1-based index).
     * @return     The modified number with the bit at the specified position toggled.
     */
    static int alterBit(int n, int pos) {
        // Check if the bit at the specified position is 1
        if (getBit(n, pos) == 1) {
            // If it is 1, clear the bit
            return clearBit(n, pos);
        }
        // If it is 0, set the bit
        return setBit(n, pos);
    }

    /**
     * The main method demonstrates the usage of the bitwise operation methods.
     *
     * @param args  Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example usage of getBit method
        int result = getBit(5, 2); // 5 = 101 in binary
        System.out.println("Get Bit: " + result); // Expected output: 1

        // Example usage of setBit method
        result = setBit(5, 2);
        System.out.println("Result after setting bit: " + result); // Expected output: 5 (bit 2 is already set)

        // Example usage of clearBit method
        result = clearBit(7, 2); // 7 = 111 in binary
        System.out.println("Result after clearing bit: " + result); // Expected output: 5 (after clearing bit 2)

        // Example usage of alterBit method
        result = alterBit(5, 2);
        System.out.println("Result after toggling bit: " + result); // Expected output: 5 (bit 2 toggled from 1 to 0)

        result = alterBit(7, 2);
        System.out.println("Result after toggling bit: " + result); // Expected output: 5 (bit 2 toggled from 1 to 0)
    }
}
