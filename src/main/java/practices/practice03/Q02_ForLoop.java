package practices.practice03;

public class Q02_ForLoop {

    public static void main(String[] args) {


    /*
     Note: A for loop runs a set of instructions a specific number of times. It ahs 3 main concepts:
     1- Initialization: where the loop starts
     2- Condition: the loop continues as long as this condition is true
     3- Increment/decrement: modifies the loop variable after each iteration
     */

    /*
    Task:
    Print numbers from 1 to 12.
    Calculate and print the sum of numbers from 1 to 12.
    Print even numbers between 1 and 12.
     */

    //Step 1: Print numbers from 1 to 12.
        System.out.println("Step 1: Print numbers from 1 to 12");
        for (int i = 1; i<=12; i++){
            System.out.println(i + " ");
        }

    //Step 2:Calculate and print the sum of numbers from 1 to 12.
        System.out.println("Step 2:Calculate and print the sum of numbers from 1 to 12.");
        int sum = 0;
        for (int i = 1; i<=12; i++){
            sum += i;  // Add each number to the sum.  => sum = sum + i;
        }
        System.out.println("sum: " +sum);

    //Step 3: Print even numbers between 1 and 12
        System.out.println("Step 3: Print even numbers between 1 and 12");
        for (int i=1; i<=12; i++){
            if(i%2== 0){
                System.out.println(i + " ");
            }
        }

   /*
   Homework:
        Print numbers from 1 to 107.
        Calculate and print the sum of even numbers only between 1 and 107.
        Print odd numbers between 1 and 107.
    */
    }
}