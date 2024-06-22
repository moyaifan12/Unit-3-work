package unit1;

import java.util.Scanner;

public class MethodChallenge2 {
  public static void main(String[] args) {
    // Create a Scanner object to get input from the user
    Scanner scanner = new Scanner(System.in);

    // Get whether the parrot is talking from the user
    System.out.print("Is the parrot talking? (true/false): ");
    boolean isTalking = scanner.nextBoolean();

    // Get the current hour from the user
    System.out.print("What is the current hour (0-23)?: ");
    int hour = scanner.nextInt();

    // Determine if we are in trouble and print the result
    boolean inTrouble = parrotTrouble(isTalking, hour);
    System.out.println("Are we in trouble? " + inTrouble);
  }

  /**
   * Determines if we are in trouble based on whether the parrot is talking and the current hour.
   *
   * @param talking - boolean indicating if the parrot is talking
   * @param hour - integer representing the current hour (0-23)
   * @return boolean - true if we are in trouble, false otherwise
   */
  public static boolean parrotTrouble(boolean talking, int hour) {
    return talking && (hour < 7 || hour > 20);
  }
}
