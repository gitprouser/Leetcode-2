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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        helper(res, root, "");
        return res;
    }
    public void helper(List<String> res, TreeNode root, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            res.add(s + root.val);
        }
        helper(res, root.left, s + root.val + "->");
        helper(res, root.right, s + root.val + "->");
    }


    public static void main(String[] args) {

    }
}
