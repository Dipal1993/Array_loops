
/*WAP to enter array and sort the values in ascending order.*/
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        //scanner class to accept the user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of elements");
        int values = scanner.nextInt();
        int array[] = new int[values];//size of array is equal to the user enter value of value
        System.out.println("Enter the elements in array");
        //insert the values in array
        for (int i = 0; i < values; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);//sort method for shorting
        System.out.println("After sorting in assending order to Array");
        for (int i = 0; i < values; i++) {
            System.out.println(array[i]);
        }

    }
}
