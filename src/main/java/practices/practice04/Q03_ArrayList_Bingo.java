package practices.practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03_ArrayList_Bingo {
    /*
    // Ask the user to enter an integer between 1 and 10
    // If the number the user entered exists in the Database (DB), replace that number with "Bingo"
    // If the number the user entered does not exist in the DB, add it to the DB
    // If all the numbers in the DB are replaced by "Bingo", display the message "You won!" and end the game
    // 4,7,1
     */

    public static void main(String[] args) {
        //Step1: Initilize the database with some numbers
        ArrayList<String> database = new ArrayList<>();
        database.add("4");
        database.add("7");
        database.add("1");
        System.out.println("database = " + database);

        //Step2: Set Up Scanner to take user input
        Scanner scan = new Scanner(System.in);

        //Step3: Initialize a boolean variable to track if the game is won
        boolean gameWon = false;

        //Ste4: Start the game loop
        while(!gameWon) {
            System.out.println("Enter a number from 1 to 10:");
            String input = scan.next();

            //Step5: Convert input to integer and validate it
            int userNumber = Integer.parseInt(input);
            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Invalid number. Please enter a number between 1 and 10.");
                continue; // Skip the rest of the loop
            }

            //Step6: Check if the number exist in the DB
            if (database.contains(input)) {
                // Replace the number with "Bingo"
                int index = database.indexOf(input);
                database.set(index, "Bingo");
                System.out.println("Bingo! You replace a number.");
            } else {
                //Add the number if it doesn't exist in the list
                database.add(input);
                System.out.println("The number was added to the DB");
            }
            //Step7: Check if all numbers in the list are "Bingo"
            gameWon = true;
            for (String entry : database) {
                if (!entry.equals("Bingo")) {
                    gameWon = false;
                    break;
                }
            }

            //Show the current state of DB
            System.out.println("Current database: " + database);

            //Step8: If the game is won, announce the winner
            if (gameWon) {
                System.out.println("You won! All numbers have been replaced with Bingo.");
            }
        }
        scan.close(); //Close the Scanner
    }
}
