package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 450: MEDIUM
// https://leetcode.com/problems/delete-node-in-a-bst/

// Approach: In this problem we don't check for parent instead we check for children.
// Because, when deleting a node we need to know about the parent for re-attaching
// descendants. So, we start at root and check if left matches the deletion node, we
// delete it. Similarly, if right child matches the deletion node, we delete it.
// Deleting a node is simple, if left child is null we return whole right subtree
// and if right child is null we return the whole left subtree. If both are not null
// then we need to return right child of the deletion node. But before that, we need
// to find the leftest node of this right-child of deletion node and attach to it the
// left child of deletion node.

public class DeleteNodeInABst {

    // Time Complexity: O(H)
    // Space Complexity: O(1)
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) return delete(root);

        TreeNode curr = root;
        while(curr != null) {
            if(key < curr.val) {
                if(curr.left != null && curr.left.val == key) {
                    curr.left = delete(curr.left);
                    break;
                }

                curr = curr.left;
            } else {
                if(curr.right != null && curr.right.val == key) {
                    curr.right = delete(curr.right);
                    break;
                }

                curr = curr.right;
            }
        }

        return root;
    }

    private TreeNode delete(TreeNode node) {
        if(node.left == null) return node.right;
        if(node.right == null) return node.left;

        TreeNode curr = node.right;
        while(curr.left != null) {
            curr = curr.left;
        }

        curr.left = node.left;

        return node.right;
    }
}