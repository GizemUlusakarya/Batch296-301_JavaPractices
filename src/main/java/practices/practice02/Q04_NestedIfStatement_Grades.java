package practices.practice02;

import java.util.Scanner;

public class Q04_NestedIfStatement_Grades {

    public static void main(String[] args) {
         /*
        Ask the user to enter their grade as an integer.
        90 - 100: Print “You got an A!”
        80 - 89: Print “You got a B!”
        70 - 79: Print “You got a C!”
        60 - 69: Print “You got a D!”
        Below 60: Print “You failed.”
        If the grade is not between 0 and 100, print an error message: “Invalid grade. Please enter a value between 0 and 100
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade = scanner.nextInt();

        //Nested If statement example
        if ( grade>= 0 && grade <=100){
            if (grade >=90){
                System.out.println("You got an A!");
            } else if (grade >=80) {
                System.out.println("You got an B!");
            } else if (grade >=70) {
                System.out.println("You got an C!");
            } else if (grade >=60) {
                System.out.println("You got an D!");
            }else {
                System.out.println("You failed.");
            }
        }else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100");
        }

        //Nested Ternary Example
        String result = (grade >= 0 && grade<=100) ?
                            (grade >= 90 ? "A" :
                             grade >= 80 ? "B" :
                             grade >= 70 ? "C" :
                             grade >= 60 ? "D" : "Fail") :
        "Invalid grade";
        System.out.println("Your result is: " + result);
    }
}
