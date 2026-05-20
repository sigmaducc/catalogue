package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

// LeetCode 106: MEDIUM
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

// Approach:
// INORDER: LEFT ROOT RIGHT
// POSTORDER: LEFT RIGHT ROOT
// From, this we can deduce that when we have inorder and postorder we can figure out the tree.
// Last element from postorder will be the root. What will be the left tree? and what will
// be right tree? For that we have our inorder array. If we find the last element of
// postorder in inorder then everything to the left of this element is actually the left subtree
// and everything to the right is right subtree. Then, for left and right subtree we repeat the
// pattern. But for fast lookup of root node's index we have to use a map.
// If we have 3 elements to the left of the element in inorder array that means our right subtree
// has 3 elements so we can pick up 3 elements after the root node in postorder array. And
// remaining elements are left subtree in postorder array.
// NOTE: QUITE OPPOSITE OF CONSTRUCT FROM INORDER AND PREORDER
// IN PREORDER WE START FROM 0 BUT FOR POSTORDER WE START FROM N-1!

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    Map<Integer, Integer> map;
    int[] inorder;
    int[] postorder;

    // Time Complexity: O(N + N) ~ O(2N)
    // Space Complexity: O(N + H) ~ O(N)
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.map = new HashMap<>();
        this.inorder = inorder;
        this.postorder = postorder;

        for(int i = 0; i <= inorder.length - 1; i++) {
            map.put(inorder[i], i);
        }

        return build(0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode build(int is, int ie, int ps, int pe) {
        if(ps > pe || is > ie) return null;

        TreeNode root = new TreeNode(this.postorder[pe]);

        int ir = map.get(this.postorder[pe]);
        int count = ie - ir;

        root.right = build(ir + 1, ie, pe - count, pe - 1);
        root.left = build(is, ir - 1, ps, pe - count  - 1);

        return root;
    }
}