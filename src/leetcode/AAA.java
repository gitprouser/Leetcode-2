package leetcode;

import java.util.*;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : AAA
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class AAA {


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,60};
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[1] * nums[nums.length - 1]);
        System.out.println(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
