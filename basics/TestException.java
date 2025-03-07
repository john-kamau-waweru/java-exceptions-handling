package basics;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m); // message
    }
}

public class TestException {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        try {
            validate(12);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
