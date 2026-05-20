package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

// LeetCode 105: MEDIUM
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

// Approach:
// INORDER: LEFT ROOT RIGHT
// PREORDER: ROOT LEFT RIGHT
// From, this we can deduce that when we have preorder and inorder we can figure out the tree.
// First element from preorder will be the root. What will be the left tree? and what will
// be right tree? For that we have our inorder array. If we find the first element of
// preorder in inorder then everything to the left of this element is actually the left subtree
// and everything to the right is right subtree. Then, for left and right subtree we repeat the
// pattern. But for fast lookup of root node's index we have to use a map.
// If we have 3 elements to the left of the element in inorder array that means our left subtree
// has 3 elements so we can pick up 3 elements after the root node in preorder array. And
// remaining elements are right subtree in preorder array.

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    Map<Integer, Integer> map;
    int[] preorder;
    int[] inorder;

    // Time Complexity: O(N + N)
    // Space Complexity: O(N + H) ~ O(N)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.map = new HashMap<>();
        this.preorder = preorder;
        this.inorder = inorder;

        for(int i = 0; i <= inorder.length - 1; i++) {
            this.map.put(inorder[i], i);
        }

        return build(0, inorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode build(int is, int ie, int ps, int pe) {
        if(ps > pe || is > ie) return null;

        TreeNode root = new TreeNode(this.preorder[ps]);

        int ir = map.get(this.preorder[ps]);
        int count = ir - is;

        root.left = build(is, ir - 1, ps + 1, ps + count);
        root.right = build(ir + 1, ie, ps + count + 1, pe);

        return root;
    }

}