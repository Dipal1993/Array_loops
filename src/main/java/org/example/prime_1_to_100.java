package org.example;

import java.util.Scanner;

public class prime_1_to_100 {

    public static void main(String[] args) {
        System.out.println("Number is devide by 3 and 5 in between 1 to 100 are : ");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print(i+",");
            }
        }

    }
}
