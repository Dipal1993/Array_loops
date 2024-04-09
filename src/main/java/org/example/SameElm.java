/*WAP to remove specific element from an array*/

package org.example;

class SameElm {

    public static void main(String[] args) {
        String[] element = {"Apple", "banana", "gavava", "Cherry"};
        String elementremove = "banana";
        int count = 0;
        System.out.println("Array before removing element " + elementremove + ":");
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }
        for (int i = 0; i < element.length; i++) {

            if (element[i].equals(elementremove)) {
                count++;
            }
        }
        // Copy elements from the original array to the new array, excluding the element to be removed
        String[] newArray = new String[element.length - count];
        int newIndex = 0;
        for (int i = 0; i < element.length; i++) {
            if (!element[i].equals(elementremove)) {
                newArray[newIndex] = element[i];
                newIndex++;
            }
        }
        // Print the new array
        System.out.println("Array after removing element " + elementremove + ":");

        for (int i = 0; i < newArray.length; i++) {

            System.out.println(newArray[i]);
        }
    }
}




    
