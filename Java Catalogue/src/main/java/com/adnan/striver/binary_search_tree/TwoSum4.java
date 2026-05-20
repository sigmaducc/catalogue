package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

// LeetCode 653: EASY
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

// Approach: We visit all nodes in DFS traversal and if we find that we had
// visited k - node.val earlier then it means we can indeed have a two sum.

public class TwoSum4 {

    Set<Integer> set;

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();

        return find(root, k);
    }

    private boolean find(TreeNode node, int k) {
        if(node == null) return false;
        if(set.contains(k - node.val)) return true;
        set.add(node.val);
        return find(node.left, k) || find(node.right, k);
    }

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
//    public boolean findTarget(TreeNode root, int k) {
//        if(root == null) return false;
//
//        Set<Integer> set = new HashSet<>();
//        Deque<TreeNode> q = new ArrayDeque<>();
//
//        q.offer(root);
//        while(!q.isEmpty()) {
//            TreeNode node = q.poll();
//
//            int diff = k - node.val;
//            if(set.contains(diff)) {
//                return true;
//            }
//
//            set.add(node.val);
//            if(node.left != null) q.offer(node.left);
//            if(node.right != null) q.offer(node.right);
//        }
//
//        return false;
//    }
}