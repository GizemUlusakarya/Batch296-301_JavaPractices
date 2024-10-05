package practices.practice03;

import java.util.Scanner;

public class Q05_DoWhile {

    public static void main(String[] args) {

        // Ask the user to input a number until they input a positive number

        Scanner scan = new Scanner(System.in);
        int number;     //this will store the number the suer enters

        do {
            System.out.println("Enter a positive number: ");
            number = scan.nextInt();       // get the number from the user
        }while (number<=0);     //keep looping if the number is less than or equal to 0 (positive number)
            System.out.println("Your number: " + number);
        }
    }
