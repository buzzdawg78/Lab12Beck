/**
 * File: Lab11Prob03.java
 * Class: CSCI 1302
 * Author: Ty Beck
 * Created on: Nov 21, 2025
 * Last Modified: Nov 21, 2025
 * Description:
 *   Uses a helper recursive method to reverse a String without creating new
 *   Strings on each recursive call.
 */

public class Lab12Prob03 {

    // Public method – the only one main() will call
    public static String reverseString(String s) {
        // Initial call to helper method, pointer starts at the last valid index
        return reverseString(s, s.length() - 1);
    }

    // Helper method – performs the actual recursive work
    public static String reverseString(String s, int index) {

        // Base case: index == 0 → only one char left
        if (index == 0) {
            return "" + s.charAt(0);
        }

        // Recursive case: return current char + recursive call moving pointer left
        return s.charAt(index) + reverseString(s, index - 1);
    }

    public static void main(String[] args) {
        // Testing the recursive helper method
        System.out.println(reverseString("hello"));     // "olleh"
        System.out.println(reverseString("abc"));       // "cba"
        System.out.println(reverseString("racecar"));   // "racecar"
        System.out.println(reverseString("A"));         // "A"
        System.out.println(reverseString("Java"));      // "avaJ"
    }
}
