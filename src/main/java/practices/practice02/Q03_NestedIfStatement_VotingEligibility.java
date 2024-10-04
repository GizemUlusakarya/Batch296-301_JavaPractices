package practices.practice02;

import java.util.Scanner;

public class Q03_NestedIfStatement_VotingEligibility {
    public static void main(String[] args) {
        /*
        Write a program that checks if a person is eligible to vote and, if eligible,
        also checks if they are eligible to run for president.
        The eligibility is based on the person's age.

        - The person is 18 years old or older, they are eligible to vote.
        - The person is 35 years old or older, they are also eligible to run for president.
        - The person is not eligible to vote, displaying how many more years they need to become eligible to vote.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote.");
            if (age >=35){
                System.out.println("You are also eligible to run for president.");
            }else{
                System.out.println("You are not eligible to run for president. You need to wait "+ (35-age) + " more year(s).");
            }
        }else {
            int yearsToVote = 18 - age;
            System.out.println("You are not eligible to vote. You need to wait " + yearsToVote + " more year(s).");
        }
    }
}
