package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Edward on 28/07/2017.
 */
public class IntersectionofTwoArrays {
    /**
     * 349. Intersection of Two Arrays
     * Given two arrays, write a function to compute their intersection.

     Example:
     Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

     Note:
     Each element in the result must be unique.
     The result can be in any order.

     time : O(n);
     space : O(n);

     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                arr.add(num);
                set.remove(num);
            }
        }
        int k = 0;
        int[] res = new int[arr.size()];
        for (int num : arr) {
            res[k++] = num;
        }
        return res;
    }
}
