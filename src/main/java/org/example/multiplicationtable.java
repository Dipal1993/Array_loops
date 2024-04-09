/* 4. Printing multiplication table using do while loop
1 2 3
2 4 6
3 6 9 */
package org.example;
public class multiplicationtable {
    public static void main(String[] args) {
        //table for 2
        int a = 2;
        int i = 1;
        //table for 3
        int b = 3;
        //table for 4
        int c = 4;
        System.out.println(" Multiplication Table ");
        do {
            int n = a * i;
            int table = b * i;
            int forthtable = c * i;
            //print the all table values in single row
            System.out.println(+n + " " + table + " " + forthtable);
            i++;
            System.out.println();
        } while (i <= 10);

    }
}