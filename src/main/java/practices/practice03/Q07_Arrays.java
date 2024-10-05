package practices.practice03;

import java.util.Arrays;

public class Q07_Arrays {
    public static void main(String[] args) {

        /*
        Create an array that stores 7 integers.
        Find and print the median value of the sorted array (the middle value when sorted).
        Swap the highest and lowest values in the array and Print the updated array.
        Reverse the array and print
        Print only even numbers from the array.
         */

        //Task 1: Create an array that stores 7 integers.
        int[] numbers= {23, 12, 56, 43, 89, 15, 38};

        //Task 2: Find and print the median value of the sorted array (the middle value when sorted).
        Arrays.sort(numbers);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));

        int medianIndex = numbers.length / 2;   //this gives us the middle index
        int medien = numbers[medianIndex];
        //int medien = numbers[numbers.length / 2];
        System.out.println("medien value= " + medien);

        //Task 3: Swap the highest and lowest values in the array and Print the updated array.
        int smallestIndex = 0; //the smallest value is at the first index
        int largerestIndex = numbers.length-1;  // the largest value is at the last index

        int temp = numbers[smallestIndex];  //step 1: save the smallest value
        numbers[smallestIndex] = numbers[largerestIndex];  //step 2: put the largest value in the first position
        numbers[largerestIndex] = temp; //step 3 : put the smallest value in the last position
        System.out.println("Array after swapping highest and lowest numbers: " + Arrays.toString(numbers));

       //Step 4: Reverse the array and print [12, 56, 43, 38, 23, 15, 89]
        System.out.println("reversed array:");
        for (int i = largerestIndex; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }

        //Step 5:Print only even numbers from the array.
        System.out.println("even numbers in the array: ");
        for (int i = 0; i<numbers.length; i++){
            if(numbers[i]%2==0){    //check if the number is divisible by 2
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
