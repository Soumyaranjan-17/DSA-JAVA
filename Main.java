class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class Main {
    static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative value is not allowed.");
        } else {
            System.out.println("Value is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkValue(-5);  // This will throw a CustomException
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
