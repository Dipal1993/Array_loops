/*1. Write a Java program to test the equality of two arrays.*/
package org.example;
import java.util.Arrays;
public class array {

    public static void main(String[] args) {
        //initializing the values for first array
        int[] a = {10,20,30};
        //initializing the values for first array
        int[] b= {19,20,34};
        //comapre the values of array
        Boolean result = Arrays.equals(a,b);
        //condition for checking result is true or faulse
        if(result == true)
        {
            System.out.println("Both arrays are equals");
        }else
        {
            System.out.println("Both arrays are not equals");
        }

    }
}
