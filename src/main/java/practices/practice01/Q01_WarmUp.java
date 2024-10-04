package practices.practice01;

public class Q01_WarmUp {

    //Simple Print
    public static void main(String[] args) {
        System.out.println("Warm-up! Let's start coding.");
        System.out.println();

        // We have info about John*. Declare that info in Java language and print on the console
        // He is 25* years old and stands at 1.75* meters tall.
        // John is currently a student*, and his name starts with the letter 'A'*.
        //Use; String, int, double, boolean, char

        //Declare Variables
        String name = "John";
        System.out.println("Name = " + name);
        int age = 25;
        System.out.println("age = " + age);
        double height = 1.75;
        System.out.println("His height is= " + height);
        boolean isStudent = true;
        char initial = 'A';

        //Print the variables
        System.out.println("His name is: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("initial = " + initial);
        System.out.println();

        // Task: Perform basic arithmetic operations with two numbers (num1=5 and num2=10).
        // 1. Add num1 and num2 to find the sum.
        // 2. Subtract num2 from num1 to find the difference.
        // 3. Multiply num1 and num2 to get the product.
        // 4. Divide num1 by num2 to get the quotient.
        // Print on console

        int num1 = 5;
        int num2 = 10;

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        System.out.println();

//        //Divide by 0
//        int num3 = 10;
//        int num4 = 0;
//        System.out.println(num3 / num4);

        // Task: Demonstrate type casting in Java.
        // 1. Perform explicit casting by converting a double to an int. (9.99)
            //Explicit casting
            double price = 9.99;
            int removedDecimalPrice = (int) price;
        System.out.println("Original price: " + price);
        System.out.println("Rounded price (after casting): " + removedDecimalPrice);
        System.out.println();

        // 2. Perform implicit casting by converting an int to a double. (5)
            //Implicit casting
        int smallNumber = 5;
        double largerNumber = smallNumber;

        System.out.println("Original number (int): " + smallNumber);
        System.out.println("Number after implicit casting to double: " + largerNumber);
        System.out.println();

        // Finding the remainder (29 and 4) ==> %
        int number = 29;
        int divisor = 4;
        int remainder = number % divisor;
        System.out.println("The remainder when " + number + " is divided by " + divisor + " is: " + remainder);
        System.out.println();

//        //Determine if a number is even or odd (int num = 13)
//        //(Even numbers: 2,4,6,8,10….)
//        //(Odd numbers: 1,3,5,7,9…)
//        int number1 = 18;
//        String result = (number1 % 2 == 0) ? "even" : "odd"; //Ternary => Checks the condition and sets the result
//        System.out.println(number1 + " is an " + result + " number.");
    }
}














