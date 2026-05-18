package com.adnan.striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// LeetCode 145: EASY
// https://leetcode.com/problems/binary-tree-postorder-traversal/

// Approach (Iterative): We use the normal DFS algorithm, because postorder is
// nothing but opposite of preorder.
// PREORDER: ROOT LEFT RIGHT -> ROOT RIGHT LEFT -> LEFT RIGHT ROOT -> POSTORDER
// So, the step becomes - reverse the LEFT and RIGHT in preorder and then reverse
// the whole. For child reversal we use normal sequential stack insertion.
// Hence, left to right insertion becomes right to left. Finally, we keep adding
// the popped elements into another stack and simply return it in the end.

public class BinaryTreePostorderTraversal {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(2N)
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();

        stack1.push(root);
        while(!stack1.isEmpty()) {
            TreeNode node = stack1.pop();

            stack2.push(node);
            if(node.left != null) stack1.push(node.left);
            if(node.right != null) stack1.push(node.right);
        }

        List<Integer> list = new ArrayList<>();
        while(!stack2.isEmpty()) {
            list.add(stack2.pop().val);
        }

        return list;
    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N)
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        postorder(root, list);
//        return list;
//    }

    private void postorder(TreeNode node, List<Integer> list) {
        if(node == null) return;

        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.val);
    }
}