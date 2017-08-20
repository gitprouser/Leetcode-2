package leetcode;

import java.util.HashSet;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : PalindromePermutation
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class PalindromePermutation {
    /**
     * 266. Palindrome Permutation
     * Given a string, determine if a permutation of the string could form a palindrome.

     For example,
     "code" -> False, "aab" -> True, "carerac" -> True.

     time : O(n)
     * @param s
     * @return
     */
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[128];
        int count = 0;
        for (char c : s.toCharArray()) {
            map[c]++;
            if (map[c] % 2 == 0) {
                count--;
            } else count++;
        }
        return count <= 1;
    }
    public boolean canPermutePalindrome2(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else set.add(c);
        }
        return set.size() <= 1;
    }
}
