package practices.practice02;


import java.util.Scanner;

public class Q01_SimpleIfElse {

    public static void main(String[] args) {

        //Ask the user a number, then check if the number is positive, negative, or zero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        }else {
            System.out.println("The number is zero.");

        }
    }
}
