package com.adnan.striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// LeetCode 144: EASY
// https://leetcode.com/problems/binary-tree-preorder-traversal/

// Approach (Iterative): We apply normal DFS algorithm but instead of pushing left
// and right in stack we push right and left because we want ROOT LEFT RIGHT.
// Since, stack reverses the order we have to do RIGHT and LEFT insertion

// Approach (Morris): Morris traversal removes the recursion/stack space requirement.
// It basically, uses the concept of threaded binary tree which is basically a normal
// binary tree, but it uses the leaf nodes as a way back to parent. That way is called
// a thread kinda like a bookmark in a forest. For a node, if the left is null we can
// move to right child. Since we have encountered this node for the first time we add
// it to the list and move right-er. If we encounter a non-null left child then we have
// to find a predecessor for the current node. We do that by taking the left child and
// moving right until there is no right child. This is in case we do not already have
// a thread, but it is possible that the predecessor is already connected to the node
// in which case we need to find if the loop exists. If the thread wasn't there that
// means it's our first encounter. So, for preorder we can count this node. For,
// inorder we need to count when we encounter the node second time. We then move
// our current pointer to left in case there was no thread and to right if we
// removed a thread.

//Morris traversal uses temporary threads to simulate recursion without a stack.
//
//For a node:
//        - if left child is null:
//            process node and go right
//
//        - otherwise:
//            find inorder predecessor
//
//            if predecessor has no thread:
//                create thread back to current
//                move left
//
//            else:
//                remove thread
//                process node
//                move right
//
//Preorder processes on first encounter.
//Inorder processes on second encounter.

public class BinaryTreePreorderTraversal {

    // Morris Traversal
    // Time Complexity: O(2N)
    // Space Complexity: O(1)
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode next = curr.left;
                while(next.right != null && next.right != curr) {
                    next = next.right;
                }

                if(next.right == null) {
                    next.right = curr;
                    list.add(curr.val);
                    curr = curr.left;
                } else {
                    next.right = null;
                    curr = curr.right;
                }
            }
        }

        return list;
    }

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root == null) return new ArrayList<>();
//
//        List<Integer> list = new ArrayList<>();
//        Deque<TreeNode> stack = new ArrayDeque<>();
//        stack.push(root);
//        while(!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//
//            list.add(node.val);
//            if(node.right != null) stack.push(node.right);
//            if(node.left != null) stack.push(node.left);
//        }
//
//        return list;
//    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        preorder(root, list);
//
//        return list;
//    }

    private void preorder(TreeNode node, List<Integer> list) {
        if(node == null) return;

        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }
}