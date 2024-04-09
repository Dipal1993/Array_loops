package org.example;
import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        int rem, rev = 0;
        //scanner class to accept input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 5 digit number");
        int num = scanner.nextInt();
        //logic for reversing the number
            rem = num % 10;
            num = num / 10;
            rev = rev + rem * 10000;

            rem=num%10;
            num=num/10;
            rev=rev+rem*1000;

            rem=num%10;
            num=num/10;
            rev=rev+rem*100;

            rem=num%10;
            num=num/10;
            rev=rev+rem*10;

            rem=num%10;
            rev=rev+rem;

        System.out.println("After Reverse :"+rev);
    }
}
