public class TestBinaryFormatException {
    public static void main(String[] args) throws BinaryFormatException {


        System.out.println("1011 is: " + bin2Dec("1011"));
        System.out.println("101001 is: " + bin2Dec("101001"));
        System.out.println("A95F is: " + bin2Dec("A95F"));

    }


    public static int bin2Dec(String binary) throws BinaryFormatException {
        int decimalValue = 0;
        for (int i = 0; i < binary.length(); i++) {
            char binChar = binary.charAt(i);
            decimalValue = decimalValue * 2 + binaryCharToDecimal(binChar);
        }
        return decimalValue;
    }

    public static int binaryCharToDecimal(char ch) throws BinaryFormatException {
        // return 1 or 0 ese throw exception
        if (ch == '1' || ch == '0') {
            return ch - '0';
        }
        throw new BinaryFormatException("Invalid Binary Character: " + ch );
    }
}
