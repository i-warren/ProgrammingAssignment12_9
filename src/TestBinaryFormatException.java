import java.util.Scanner;

/**
 * Program asks user to enter a binary string. This is then checked for correct binary characters.
 * If valid String is converted to decimal integer and printed to user.
 * In invalid throws custom BinaryFormatException.
 *
 * @author Isaac Warren
 */

public class TestBinaryFormatException {
    public static void main(String[] args) throws BinaryFormatException {
        Scanner input = new Scanner(System.in);     // Create new Scanner Object

        // Prompt user for binary number for conversion
        System.out.print("Enter a binary number to convert to decimal: ");
        String binaryString = input.next();

        // Convert binaryString to decimal value and print result
        System.out.println(binaryString +
                " is: " +
                bin2Dec(binaryString));
    }



    /** Takes binary String and returns a decimal value
     *  Calls binaryCharToDecimal(char ch)
     *  Throws BinaryFormatException */
    public static int bin2Dec(String binary) throws BinaryFormatException {
        int decimalValue = 0;
        for (int i = 0; i < binary.length(); i++) {
            char binChar = binary.charAt(i);
            decimalValue = decimalValue * 2 + binaryCharToDecimal(binChar);
        }
        return decimalValue;
    }

    /** Checks char for valid binary character If valid returns decimal integer
     * if invalid throws BinaryFormatException */
    public static int binaryCharToDecimal(char ch) throws BinaryFormatException {
        // return 1 or 0 ese throw exception
        if (ch == '1' || ch == '0') {
            return ch - '0';
        }
        throw new BinaryFormatException("Invalid Binary Character: " + ch );
    }
}
