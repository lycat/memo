package com.lycat.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 2016/12/21.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;

        List<TreeNode> cur = new ArrayList<TreeNode>();
        cur.add(root);

        while (true) {
            if (cur.isEmpty()) break;
            List<TreeNode> next = new ArrayList<TreeNode>();
            List<Integer> value = new ArrayList<Integer>();
            for (TreeNode node :cur) {
                value.add(node.val);
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            cur = next;
            result.add(value);
        }
        return result;
    }
}