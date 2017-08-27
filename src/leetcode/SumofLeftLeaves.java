package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : SumofLeftLeaves
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int res = 0 - root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (i == 0) {
                    res += cur.val;
                }
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
        }
        return res;
    }
}
