package com.hudsonmx.service.arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p/>
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *<p/>
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 * <p/>
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 * */
public class SquaresOfASortedArray{

    /**
     * The sortedSquares method returns an array of the squares of each number in the input array nums sorted in non-decreasing order.
     * How it works:
     * It initializes an array result of the same length as nums.
     * It initializes two pointers left and right to the start and end of the array, respectively.
     * It iterates over the array from the end to the start.
     * For each iteration, it compares the absolute values of the numbers at the left and right pointers.
     * It squares the number with the greater absolute value and decrements the corresponding pointer.
     * It stores the squared number in the result array at the current index.
     * It returns the result array.
     * <p/>
     * Example 1:
     * Input: nums = [-4,-1,0,3,10]
     * Process:
     * left = 0, right = 4
     * Compare abs(-4) and abs(10), abs(10) is greater
     * Store 100 in result[4]
     * left = 0, right = 3
     * Compare abs(-4) and abs(3), abs(3) is greater
     * Store 9 in result[3]
     * left = 1, right = 3
     * Compare abs(-1) and abs(3), abs(3) is greater
     * Store 9 in result[2]
     * left = 2, right = 3
     * Compare abs(0) and abs(3), abs(3) is greater
     * Store 9 in result[1]
     * left = 2, right = 2
     * Compare abs(0) and abs(0), abs(0) is greater
     * Store 0 in result[0]
     * Output: [0,1,9,16,100]
     * <p/>
     * */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }

}
