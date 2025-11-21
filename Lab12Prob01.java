/**
 * File: Lab11Prob01.java
 * Class: CSCI 1302
 * Author: Ty Beck
 * Created on: Nov 21, 2025
 * Last Modified: Nov 21, 2025
 * Description:
 *   Implements a recursive method using the recurrence:
 *     f(0) = 1
 *     f(1) = 3
 *     f(2) = 4
 *     f(n) = f(n - 3) * (f(n - 2) - f(n - 1))
 */

public class Lab12Prob01 {

    // Recursive method that uses the provided recurrence relation.
    public static int recursiveAbstract(int n) {
        // Base cases for f(0), f(1), f(2)
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }

        // Recursive case: f(n) = f(n-3) * (f(n-2) - f(n-1))
        return recursiveAbstract(n - 3) *
               (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
    }

    public static void main(String[] args) {
        // Basic testing (Gradescope will test the recursive method only)
        System.out.println(recursiveAbstract(0)); // 1
        System.out.println(recursiveAbstract(1)); // 3
        System.out.println(recursiveAbstract(2)); // 4
        System.out.println(recursiveAbstract(3)); // -1
        System.out.println(recursiveAbstract(4)); // 15
        System.out.println(recursiveAbstract(5)); // -64
        System.out.println(recursiveAbstract(6)); // -79
    }
}
