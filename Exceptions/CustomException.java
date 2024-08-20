class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int age = 15;

        try {
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Step 2: Modify the method to throw the custom exception
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}
