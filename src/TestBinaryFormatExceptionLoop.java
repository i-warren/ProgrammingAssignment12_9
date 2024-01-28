import java.util.Scanner;

/**
 * Program asks user to enter a binary string. This is then checked for correct binary characters.
 * If valid String is converted to decimal integer and printed to user.
 * In invalid throws and catches custom BinaryFormatException.
 * Program continues until user enters 'n' when asked if they want to continue.
 *
 * @author Isaac Warren
 */

public class TestBinaryFormatExceptionLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Create new Scanner Object

        boolean keepRunning = true;     // Set value for Do
        do {
            try {
                // Prompt user for binary number for conversion
                System.out.print("\nEnter a binary number to convert to decimal: ");
                String binaryString = input.next();

                // Convert binaryString to decimal value and print result
                System.out.println(binaryString +
                        " is: " +
                        bin2Dec(binaryString));

                // Asks user if they wish to continue if 'n' is entered program exits do block
                System.out.print("\nContinue (y/n): ");
                if (input.next().toLowerCase().equals("n")) {
                    keepRunning = false;
                }
            // Catches Binary Format Exception and prints to warn user
            } catch (BinaryFormatException e) {
                System.out.println("Invalid Binary Number");
            }
        } while (keepRunning);

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

