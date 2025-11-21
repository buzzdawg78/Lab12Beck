/**
 * File: Lab12Prob02.java
 * Class: CSCI 1302
 * Author: Ty Beck
 * Created on: Nov 21, 2025
 * Last Modified: Nov 21, 2025
 * Description:
 *   Recursively reverses a String using the rule:
 *     - If the String has one character → return it
 *     - Otherwise → return last char + reverseString(all but last char)
 */

public class Lab12Prob02 {

    // Recursive method to reverse a String
    public static String reverseString(String s) {

        // Base case: string of length 0 or 1 is already reversed
        if (s.length() <= 1) {
            return s;
        }

        // Recursive case:
        // return last char + reverseString( everything except last char )
        char last = s.charAt(s.length() - 1);
        String rest = s.substring(0, s.length() - 1);

        return last + reverseString(rest);
    }

    public static void main(String[] args) {
        // Testing the recursive method
        System.out.println(reverseString("hello"));     // "olleh"
        System.out.println(reverseString("abc"));       // "cba"
        System.out.println(reverseString("racecar"));   // "racecar"
        System.out.println(reverseString("A"));         // "A"
    }
}
