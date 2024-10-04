package practices.practice01;

public class Q02_BreakInteger {

    public static void main(String[] args) {
        /*
        Write a Java programme to break an integer into a sequence of individual digits.
        Hint: use / and %
        x: input: 12345
        output: 1
               2
               3
               4
               5
         */

        // Modulo (%) ==> This operator gives us the remainder after division. 12345 % 10 = 5
        // Division (/) ==> This operator performs normal division.
                // But, when we divide integers in Java, it throws away the decimal part. 12345 / 10 = 1234

        int x = 12345;
        int ones = x % 10; // This gives us the last digit ==> 12345 % 10 = 5
        int tens = (x / 10) %10; // We remove the last digit, then get the last digit ==> 12345/10 => 1234 %10 = 4
        int hundreds = (x / 100) %10; //Remove the last two digits, then extract the last digit ==> 12345 / 100 => 123 %10 = 3
        int thousands = (x / 1000) %10; //Remove the last three digit, then get the last digit ==> 12345 / 1000 => 12 %10 = 2
        int tenThousands = (x / 10000) %10; // Remove last 4 digits, then gives us the last digit ==> 12345 / 10000 => 1 %10 = 1

        System.out.println(tenThousands + "\n" + thousands + "\n" + hundreds + "\n" + tens +"\n"+ ones);

//        System.out.println(tenThousands);
//        System.out.println(thousands);
//        System.out.println(hundreds);
//        System.out.println(tens);
//        System.out.println(ones);

        //Additional information: camelCase, snake_case, PASCAL_CASE, kebab-case ==> naming conventions
    }
}




