package practices.practice03;

import java.util.Scanner;

public class Q04_NestedLoop_NumberTriangle {

    public static void main(String[] args) {
        /*
        INTERVIEW QUESTION
        Type code to ask user to enter the number of rows and print the
        shape below according to that number:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scan.nextInt();
        System.out.println("rows = " + rows);

        int number = 10;
        for (int i = 0; i<rows; i++){       //outer loop is used for row control
            for (int j = 0; j<=i; j++){
                System.out.print(number + " ");
                number ++;
            }
            System.out.println();
        }
    }
}
