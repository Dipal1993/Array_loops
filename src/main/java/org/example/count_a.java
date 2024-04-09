/*WAP to enter any String and count total number of 'a' in that String.*/
package org.example;

import java.util.Scanner;

public class count_a {
    public static void main(String[] args) {
        //scanner class for accept the input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scanner.next();
        //initialize the variable count with o.
        int count = 0;
        //use for loop to count the total number of a or A
        for (int i = 0; i < s.length(); i++) {
            //check every character of string is it A or a
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count += 1;
            }
        }
        System.out.println("Total count of 'a' or 'A' in the string: " +count);
    }
}
