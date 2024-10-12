package practices.practice04;

import java.util.Arrays;

public class Q01_Arrays_Anagram {

    /*
    Type code to check if two Strings are Anagram or not

        Anagram: A word or phrase made by using the letters of another word/phrase in a different order.
        Ex:
        dormitory -> dirty room
        debit card -> bad credit
        eleven plus two -> twelve plus one
        a decimal point -> I'm a dot in place
        vacation time -> I am not active
     */

    public static void main(String[] args) {
        System.out.println(isAnagram("dormitory", "dirty room"));
        System.out.println(isAnagram("debit card", "bad credit"));
        System.out.println(isAnagram("eleven/* plus25 two", "twelve65 plu5s one"));
    }

    public static boolean isAnagram(String str1, String str2){
        String[] arr1 = str1.toLowerCase().replaceAll("[^a-z]", "").split("");
        String[] arr2 = str2.toLowerCase().replaceAll("[^a-z]", "").split("");

        System.out.println("arr1 = " + Arrays.toString(arr1)); // arr1 = [d, o,r,m,i,t,o,r,y]
        System.out.println("arr2 = " + Arrays.toString(arr2)); // arr2 = [d,i,r,t,y,r,o,o,m]

        Arrays.sort(arr1); // arr1 = [d,i,m,o,o,r,r,t,y]
        Arrays.sort(arr2); // arr2 = [d,i,m,o,o,r,r,t,y]

        System.out.println("arr1 = " + Arrays.toString(arr1)); // arr1 = [d,i,m,o,o,r,r,t,y]
        System.out.println("arr2 = " + Arrays.toString(arr2)); // arr2 = [d,i,m,o,o,r,r,t,y]

        if (Arrays.equals(arr1,arr2)){
            return true;
        }else {
            return false;
        }
    }
}
