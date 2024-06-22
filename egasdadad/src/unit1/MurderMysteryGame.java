package unit1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MurderMysteryGame {

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> clues = new ArrayList<>();
    private static List<String> suspects = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        System.out.println("Welcome to the Expanded Murder Mystery Game!");
        System.out.println("A murder has occurred, and it's up to you to solve the mystery.");

        suspects.add("John Doe");
        suspects.add("Jane Smith");
        suspects.add("Sam Brown");

        System.out.println("Do you want to inspect the body or the surroundings? (body/surroundings): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("body")) {
            clues.add(inspectBody());
        } else if (choice.equals("surroundings")) {
            clues.add(inspectSurroundings());
        } else {
            System.out.println("Invalid choice. Try again.");
            playGame();
            return;
        }

        System.out.println("Do you want to talk to characters (Detective Anderson, Mrs. Johnson, Alex Turner) or gather more clues? (characters/gather): ");
        choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("characters")) {
            clues.add(talkToCharacters());
        } else if (choice.equals("gather")) {
            clues.add(gatherMoreClues());
        } else {
            System.out.println("Invalid choice. Try again.");
            playGame();
            return;
        }

        System.out.println("Do you want to revisit the crime scene or investigate suspect's alibi? (scene/alibi): ");
        choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("scene")) {
            clues.add(revisitCrimeScene());
        } else if (choice.equals("alibi")) {
            clues.add(investigateAlibi());
        } else {
            System.out.println("Invalid choice. Try again.");
            playGame();
            return;
        }

        System.out.println("Do you want to follow up on a new lead or revisit a character? (lead/character): ");
        choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("lead")) {
            clues.add(followUpOnLead());
        } else if (choice.equals("character")) {
            clues.add(revisitCharacter());
        } else {
            System.out.println("Invalid choice. Try again.");
            playGame();
            return;
        }

        System.out.println("Do you want to confront the suspect or consult with Detective Anderson? (confront/consult): ");
        choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("confront")) {
            clues.add(confrontSuspect());
        } else if (choice.equals("consult")) {
            clues.add(consultDetective());
        } else {
            System.out.println("Invalid choice. Try again.");
            playGame();
            return;
        }

        finalAccusation();
    }

    public static String inspectBody() {
        System.out.println("You chose to inspect the body.");
        System.out.println("Do you want to examine the wounds or check the pockets? (wounds/pockets): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("wounds")) {
            System.out.println("You found a strange mark on the victim's neck.");
            return "strange mark";
        } else if (choice.equals("pockets")) {
            System.out.println("You found a mysterious note in the victim's pocket.");
            return "mysterious note";
        } else {
            System.out.println("Invalid choice. Try again.");
            return inspectBody();
        }
    }

    public static String inspectSurroundings() {
        System.out.println("You chose to inspect the surroundings.");
        System.out.println("Do you want to talk to witnesses or search for evidence? (witnesses/evidence): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("witnesses")) {
            System.out.println("A witness saw someone running away from the scene.");
            return "witness testimony";
        } else if (choice.equals("evidence")) {
            System.out.println("You found a bloody glove near the scene.");
            return "bloody glove";
        } else {
            System.out.println("Invalid choice. Try again.");
            return inspectSurroundings();
        }
    }

    public static String talkToCharacters() {
        System.out.println("You chose to talk to characters.");
        System.out.println("Who do you want to talk to? (Detective Anderson, Mrs. Johnson, Alex Turner): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("detective anderson")) {
            System.out.println("Detective Anderson provides you with some valuable insights.");
            return "insight from Detective Anderson";
        } else if (choice.equals("mrs. johnson")) {
            System.out.println("Mrs. Johnson mentions seeing some suspicious activity.");
            return "Mrs. Johnson's testimony";
        } else if (choice.equals("alex turner")) {
            System.out.println("Alex Turner reveals a secret about the victim.");
            return "Alex Turner's revelation";
        } else {
            System.out.println("Invalid choice. Try again.");
            return talkToCharacters();
        }
    }

    public static boolean accuseSuspect() {
        System.out.println("You chose to accuse a suspect.");
        boolean success = random.nextBoolean();  // 50% chance to succeed

        if (success) {
            System.out.println("Your accusation was correct! You solved the mystery.");
        } else {
            System.out.println("Your accusation was wrong. The true culprit remains at large.");
        }

        return success;
    }

    public static String gatherMoreClues() {
        System.out.println("You chose to gather more clues.");
        System.out.println("Do you want to review clues or interrogate suspects? (review/interrogate): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("review")) {
            System.out.println("Reviewing the clues gives you new insights into the crime.");
            return "insights";
        } else if (choice.equals("interrogate")) {
            System.out.println("Interrogating the suspects reveals hidden motives.");
            return "confessions";
        } else {
            System.out.println("Invalid choice. Try again.");
            return gatherMoreClues();
        }
    }

    public static String revisitCrimeScene() {
        System.out.println("You chose to revisit the crime scene.");
        System.out.println("You find additional evidence at the scene.");
        return "additional evidence";
    }

    public static String investigateAlibi() {
        System.out.println("You chose to investigate the suspect's alibi.");
        System.out.println("You confirm or refute the suspect's alibi.");
        return "alibi investigation result";
    }

    public static String followUpOnLead() {
        System.out.println("You chose to follow up on a new lead.");
        System.out.println("You gain crucial evidence from the lead.");
        return "crucial evidence";
    }

    public static String revisitCharacter() {
        System.out.println("You chose to revisit a character.");
        System.out.println("Who do you want to revisit? (Detective Anderson, Mrs. Johnson, Alex Turner): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("detective anderson")) {
            System.out.println("Detective Anderson provides additional insights.");
            return "additional insights from Detective Anderson";
        } else if (choice.equals("mrs. johnson")) {
            System.out.println("Mrs. Johnson provides more details about the suspicious activity.");
            return "additional testimony from Mrs. Johnson";
        } else if (choice.equals("alex turner")) {
            System.out.println("Alex Turner reveals more details about the victim's life.");
            return "additional revelation from Alex Turner";
        } else {
            System.out.println("Invalid choice. Try again.");
            return revisitCharacter();
        }
    }

    public static String confrontSuspect() {
        System.out.println("You chose to confront the suspect.");
        System.out.println("The suspect's reaction gives you more clues.");
        return "suspect's reaction";
    }

    public static String consultDetective() {
        System.out.println("You chose to consult with Detective Anderson.");
        System.out.println("Detective Anderson gives you advice on the next steps.");
        return "advice from Detective Anderson";
    }

    public static void finalAccusation() {
        System.out.println("It's time to make the final accusation.");
        System.out.println("Who do you accuse as the murderer? (John Doe, Jane Smith, Sam Brown): ");
        String suspect = scanner.nextLine().trim().toLowerCase();

        if (suspect.equals("john doe")) {
            System.out.println("You accused John Doe! You solved the mystery.");
        } else if (suspect.equals("jane smith")) {
            System.out.println("You accused Jane Smith! You solved the mystery.");
        } else if (suspect.equals("sam brown")) {
            System.out.println("You accused Sam Brown! You solved the mystery.");
        } else {
            System.out.println("You accused the wrong suspect. The true culprit remains at large.");
        }
    }
}
