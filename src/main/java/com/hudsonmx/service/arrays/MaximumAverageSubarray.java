package com.hudsonmx.service.arrays;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error
 * less than 10-5 will be accepted.
 * Example 1:
 * <p>
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 * <p>
 * Input: nums = [5], k = 1
 * Output: 5.00000
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= k <= n <= 10^5
 * -10^4 <= nums[i] <= 10^4
 */
public class MaximumAverageSubarray {

    /**
     * The findMaxAverage method finds the maximum average value of a contiguous subarray of length k in a given integer array nums. Here's a
     * step-by-step explanation with an example:
     * <p/>
     * Explanation:
     * Initialize the Current Sum: Calculate the sum of the first k elements of the array. This sum represents the sum of the first window of size k.
     * Calculate the Initial Maximum Average: Compute the average of the first window by dividing the current sum by k.
     * Slide the Window: Iterate through the array starting from the k-th element to the end. For each element:
     * Add the current element to the current sum.
     * Subtract the element that is k positions behind the current element from the current sum. This effectively slides the window one position to
     * the right.
     * Calculate the average of the current window.
     * Update the maximum average if the current window's average is greater than the previously recorded maximum average.
     * Return the Maximum Average: After iterating through the array, return the maximum average found.
     * <p/>
     * Example:
     * Input: nums = [1, 12, -5, -6, 50, 3], k = 4
     * Process:
     * Calculate the sum of the first k elements: 1 + 12 - 5 - 6 = 2
     * Initial maximum average: 2 / 4 = 0.5
     * Slide the window:
     * Add 50 and remove 1: 2 + 50 - 1 = 51, average: 51 / 4 = 12.75
     * Add 3 and remove 12: 51 + 3 - 12 = 42, average: 42 / 4 = 10.5
     * The maximum average found is 12.75
     * Output: 12.75
     */
    public double findMaxAverage(int[] nums, int k) {

        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxAverage = currentSum / k;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // slide the window
            double currentAverage = currentSum / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }

        return maxAverage;
    }

}
