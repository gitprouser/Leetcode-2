package leetcode;

import java.util.HashSet;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : TwoSumIVInputisaBST
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class TwoSumIVInputisaBST {

    /**
     * 653. Two Sum IV - Input is a BST
     Given a Binary Search Tree and a target number, return true if there exist two
     elements in the BST such that their sum is equal to the given target.

     Example 1:
     Input:
         5
        / \
       3   6
      / \   \
     2   4   7

     Target = 9

     Output: True
     * @param root
     * @param k
     * @return
     */

    //time : O(n), space : O(n)
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, set, k);
    }

    public boolean helper(TreeNode root, HashSet<Integer> set, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return helper(root.left, set, k) || helper(root.right, set, k);
    }

    //time : O(nlogn) space : O(h)  h : logn ~ n

    public boolean findTarget2(TreeNode root, int k) {
        return dfsFirstVal(root, root, k);
    }

    public boolean dfsFirstVal(TreeNode first, TreeNode second, int k) {
        if (second == null) return false;
        return dfsSecondVal(first, second, k - second.val) || dfsFirstVal(first, second.left, k) || dfsFirstVal(first, second.right, k);
    }
    public boolean dfsSecondVal(TreeNode first, TreeNode second, int value) {
        if (first == null) return false;
        return (first.val == value) && (first != second)
                || (first.val < value) && dfsSecondVal(first.right, second, value)
                || (first.val > value) && dfsSecondVal(first.left, second, value);
    }

}
