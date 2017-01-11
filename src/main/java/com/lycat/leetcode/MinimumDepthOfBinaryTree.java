package com.lycat.leetcode;

/**
 * Created by liuyang on 2016/12/21.
 */

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null ) {
            return 1 + minDepth(root.right);
        } else if (root.right == null) {
            return 1 + minDepth(root.left);
        } else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
