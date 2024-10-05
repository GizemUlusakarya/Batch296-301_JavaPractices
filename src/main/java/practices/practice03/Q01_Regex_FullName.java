package practices.practice03;

import java.util.Scanner;

public class Q01_Regex_FullName {

    public static void main(String[] args) {

        /*
             Divide the 2-word name and surname you will receive from the user into separate words.
             Print the name and surname on the screen separately.
              EXAMPLE:
              INPUT: John Doe
              OUTPUT:
              First name: John
             Surname: Doe
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and surname with a space between");
        String fullName = scan.nextLine().replaceAll("\\s+", " ").replaceAll("[^a-zA-Z ]", " ").trim();

        /*
        Note:
        1- replaceAll("\\s", " ") ==> ensures that multiple spaces between the first name and surname are reduced to just one space
        2- \\s+ ==> matches one or more whitespace characters (like spaces or tabs)
        3- [^a-zA-Z ] ==> anything that this not a letter or space
         */

        String firstName = fullName.split(" ")[0].substring(0,1).toUpperCase() + fullName.split(" ")[0].substring(1).toLowerCase();
        String surname = fullName.split(" ")[1].substring(0,1).toUpperCase() + fullName.split(" ")[1].substring(1).toLowerCase();

        System.out.println("First name: " + firstName + "\nSurname: " + surname);
    }
}
