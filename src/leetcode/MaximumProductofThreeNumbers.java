package leetcode;

import java.util.Arrays;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : MaximumProductofThreeNumbers
 * Creator : Edward
 * Date : Sep, 2017
 * Description : TODO
 */
public class MaximumProductofThreeNumbers {
    /**
     * 628. Maximum Product of Three Numbers
     * Example 1:
     Input: [1,2,3]
     Output: 6
     Example 2:
     Input: [1,2,3,4]
     Output: 24


     * @param nums
     * @return
     */
    // time : O(nlogn) space : O(nlogn)
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    // time : O(n) space : O(1)
    public int maximumProduct2(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
