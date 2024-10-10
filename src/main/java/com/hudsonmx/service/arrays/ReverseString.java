package com.hudsonmx.service.arrays;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p/>
 * <p>
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p/>
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * <p/>
 * Constraints:
 * 1 <= s.length <= 10^5
 * s[i] is a printable ascii character.
 */
public class ReverseString {

    /**
     * The reverseString method reverses the order of characters in a given array of characters s in place, meaning it modifies the original array
     * without using extra memory.
     * How it works:
     * It iterates over the first half of the array.
     * For each character in the first half, it swaps it with the corresponding character in the second half.
     * <p/>
     * Example 1:
     * Input: s = ['h', 'e', 'l', 'l', 'o']
     * Process:
     * Swap s[0] ('h') with s[4] ('o')
     * Swap s[1] ('e') with s[3] ('l')
     * Output: s = ['o', 'l', 'l', 'e', 'h']
     * <p/>
     * Example 2:
     * Input: s = ['H', 'a', 'n', 'n', 'a', 'h']
     * Process:
     * Swap s[0] ('H') with s[5] ('h')
     * Swap s[1] ('a') with s[4] ('a')
     * Swap s[2] ('n') with s[3] ('n')
     * Output: s = ['h', 'a', 'n', 'n', 'a', 'H']
     *
     * @param s the input string to reverse
     */
    public char[] reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        return s;
    }
}
