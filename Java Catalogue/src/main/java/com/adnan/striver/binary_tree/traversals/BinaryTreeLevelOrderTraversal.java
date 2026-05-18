package com.adnan.striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// LeetCode 102: MEDIUM
// https://leetcode.com/problems/binary-tree-level-order-traversal/

// Approach: We use BFS algorithm, but at each node we process all the children.

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if(root == null) return list;

        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            while(size-- > 0) {
                TreeNode node = q.poll();
                if(node == null) continue;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                l.add(node.val);
            }
            list.add(l);
        }

        return list;
    }
}