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

public class BinaryTreeInorderTraversal {

    // Morris Traversal
    // Time Complexity: O(2N)
    // Space Complexity: O(1)
    public List<Integer> inorderTraversal(TreeNode root) {
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
                    curr = curr.left;
                } else {
                    next.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return list;
    }

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Deque<TreeNode> stack = new ArrayDeque<>();
//        if(root == null) return list;
//
//        TreeNode curr = root;
//        while(curr != null || !stack.isEmpty()) {
//            while(curr != null) {
//                stack.push(curr);
//                curr = curr.left;
//            }
//
//            curr = stack.pop();
//            list.add(curr.val);
//            curr = curr.right;
//        }
//
//        return list;
//    }

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