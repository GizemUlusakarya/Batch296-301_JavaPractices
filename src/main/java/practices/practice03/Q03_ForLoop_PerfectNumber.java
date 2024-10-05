package practices.practice03;

import java.util.Scanner;

public class Q03_ForLoop_PerfectNumber {

    public static void main(String[] args) {

        /*
        Type code to ask user to enter an integer and check if it is 'Perfect Number' or not."
            Divisors: Numbers that can divide a given number without leaving a remainder. For example, divisors of 6 are 1, 2, and 3.
            Perfect Number: A number that is equal to the sum of its divisors (excluding itself).
            6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        int sum=0;
        for (int i = 1; i<number; i++){
            if(number%i==0){
                sum +=i;
            }
        }

        if(sum==number){
            System.out.println(number + " is a Perfect Number");
        }else {
            System.out.println(number + " is not a Perfect Number");
        }
    }
}
