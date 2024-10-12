package practices.practice04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q02_ArrayList {
    /*
    Create a list containing 200 positive integers less than the value 1000.
    Ask the user for a number and tell the user whether it is in the list or not.
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random ran = new Random();

        while (numbers.size()<=200){
            int num = ran.nextInt(1000);

            if(!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        System.out.println(numbers);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int input = scan.nextInt();

        if (numbers.contains(input)){
            System.out.println("The list contains this number! :) ");
        }else {
            System.out.println("The list does not contain this number :( ");
        }
    }
}
