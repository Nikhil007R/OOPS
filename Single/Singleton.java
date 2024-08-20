public class Singleton {

    // Step 1: Create a private static variable to hold the single instance of the
    // class
    private static Singleton instance;

    // Step 2: Make the constructor private so that this class cannot be
    // instantiated from outside
    private Singleton() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method that returns the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create the instance if it doesn't exist
        }
        return instance; // Return the single instance
    }

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

    }

}

// Improving the Singleton to Be Thread-Safe:
// 1. Synchronized Method:
// The simplest way to ensure thread safety is to synchronize the getInstance() method:

// java
// Copy code
// public static synchronized Singleton getInstance() {
//     if (instance == null) {
//         instance = new Singleton();
//     }
//     return instance;
// }