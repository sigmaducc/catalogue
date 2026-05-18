package com.adnan.striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// LeetCode 94: EASY
// https://leetcode.com/problems/binary-tree-inorder-traversal/

// Approach (Iterative): Since, inorder traversal is LEFT ROOT RIGHT
// We need to evaluate the left subtree first. So, we keep moving left
// until we encounter a null node at which point we know our parent is
// inorder so we save the parent and move the pointer to the right child.

public class BinaryTreeInorderTraversal {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if(root == null) return list;

        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }

        return list;
    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        inorder(root, list);
//
//        return list;
//    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}