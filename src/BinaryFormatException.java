public class BinaryFormatException
        extends Exception {
    BinaryFormatException() {
        super("Illegal binary character");
    }

    BinaryFormatException(String message) {
        super(message);
    }
}


