public class BuiltInException {

    public static void main(String[] args) {
        int age = 15;

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}