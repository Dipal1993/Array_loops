/*. WAP to find the common element so between two string arrays */
package org.example;
import java.util.Arrays;
public class findcommanel {
    public static void main(String[] args) {
        String[] set1={"car","bike","riksha","cycle","truck","tempo"};
        String[] set2={"bike","riksha","auto","oddi","plane","roket"};
        System.out.println("Elements of first array");
        System.out.println("Array 1: "
                + Arrays.toString(set1));
        System.out.println("Elements of second array");
        System.out.println("Array 2: "
                + Arrays.toString(set2));
       //compare the array values to find comman elements
        System.out.println("similar elements between two arrays are");
         for(int i =0;i<set1.length;i++)
         {
             for(int j =0;j<set2.length;j++){

                 if(set1[i].equals(set2[j])){
                     System.out.println(set1[i]);
                     break;
                 }
             }
         }

    }
}
