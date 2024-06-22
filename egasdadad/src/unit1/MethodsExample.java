package unit1;

public class MethodsExample {

    /**
     * The main method is the entry point of the program.
     * It calls other methods to demonstrate their functionality.
     *
     * @param rags unused
     */
    public static void main(String[] args) {
        // Call the greet method
        greet();

        // Call the printSquare method
        printSquare();

        // Call the displayMessage method
        displayMessage();
    }

    /**
     * Prints a greeting message to the console.
     * This method does not take any parameters and does not return any value.
     */
    public static void greet() {
        System.out.println("Hello, students!");
    }

    /**
     * Prints a 5x5 square made of asterisks to the console.
     * This method does not take any parameters and does not return any value.
     */
    public static void printSquare() {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
    }

    /**
     * Prints a motivational message to the console.
     * This method does not take any parameters and does not return any value.
     */
    public static void displayMessage() {
        System.out.println("Keep up the great work, and happy coding!");
    }
}
