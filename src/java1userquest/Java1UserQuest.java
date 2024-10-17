
package java1userquest;
// Importing the Scanner class to read user input
import java.util.Scanner;
/**
 *
 * @author jhane
 */
public class Java1UserQuest {

    /**
     * @param args the command line arguments
     */
    // Main method - this is the entry point of the program
    public static void main(String[] args) {
        
        // I create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Boolean variable to control the loop (whether to keep asking questions)
        boolean continueLoop = true;

        // This while loop will keep running as long as the user wants to continue
        while (continueLoop) {

            // Prompt the user with the first question: "What is your quest?"
            System.out.print("What is your quest? ");
            
            // I read the user's input for their quest and store it in the 'quest' variable
            String quest = scanner.nextLine();

            // Prompt the user with the second question: "What is your favourite colour?"
            System.out.print("What is your favourite colour? ");
            
            // I read the user's input for their favorite color and store it in the 'colour' variable
            String colour = scanner.nextLine();

            // Output a message combining both the user's quest and favorite color
            System.out.println("Ah, I see your quest is to " + quest + ", and your favourite colour is " + colour + ".");

            // I ask the user if they want to continue or exit the loop
            System.out.print("Do you want to continue? (yes/no): ");
            
            // I read the user's decision whether to continue or not
            String response = scanner.nextLine();

            // If the user types "no" (case-insensitive), I stop the loop by setting continueLoop to false
            if (response.equalsIgnoreCase("no")) {
                continueLoop = false;
                System.out.println("Goodbye!");
            }
        }

        // I close the Scanner object to free up resources after the loop is done
        scanner.close();
    }
}
