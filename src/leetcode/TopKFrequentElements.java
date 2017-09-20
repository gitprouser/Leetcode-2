package leetcode;

import java.util.*;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : TopKFrequentElements
 * Creator : Edward
 * Date : Sep, 2017
 * Description : TODO
 */
public class TopKFrequentElements {
    /**
     * 347. Top K Frequent Elements
     * Given a non-empty array of integers, return the k most frequent elements.

     For example,
     Given [1,1,1,2,2,3] and k = 2, return [1,2].

     [1,1,1,2,2,3,3,4]  length = 8

     map :
     num : freq
     1 : 3
     2 : 2
     3 : 2
     4 : 1

     [0,1,2,3,4,5,6,7,8]  length = 9  bucket : freq
        4 2 1
            3
     res : 1 3

     * @param nums
     * @param k
     * @return
     */

    // Bucket sort : time : O(n) space : O(n)
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }
            bucket[freq].add(num);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
            }
        }
        return res;
    }

    // PriorityQueue : time : O(klogn) space : O(n)
    public List<Integer> topKFrequent2(int[] nums, int k) {

    }

    // TreeMap : time : O(klogn) space : O(n)
    public List<Integer> topKFrequent3(int[] nums, int k) {

    }
}
