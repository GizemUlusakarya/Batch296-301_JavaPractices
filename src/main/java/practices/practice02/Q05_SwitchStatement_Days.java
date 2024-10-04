package practices.practice02;

import java.util.Scanner;

public class Q05_SwitchStatement_Days {

    public static void main(String[] args) {
        /*
        Ask the user to enter a number between 1 and 7, where each number corresponds to a day of the week:
            1: Monday
            2: Tuesday
            3: Wednesday
            4: Thursday
            5: Friday
            6: Saturday
            7: Sunday
        Use a switch statement to determine and print the name of the day based on the input number.
        If the number is not between 1 and 7, print an error message: "Invalid day number. Please enter a value between 1 and 7."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a value between 1 and 7.");
        }

    }
}
