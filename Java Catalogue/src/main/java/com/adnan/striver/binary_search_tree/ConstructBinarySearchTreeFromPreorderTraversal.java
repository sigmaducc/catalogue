package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 1008: MEDIUM
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

// Approach: Since, preorder is given that means we have to follow this paradigm ROOT LEFT RIGHT
// We start at 0 and go into build() for the first time. Meaning our first node has (-Inf, +Inf) range
// and node val is preorder[0]. Now obviously this is in range, so we move forward create a tree node
// and increment i. We then allocate the task to left subtree and right subtree recursively.

public class ConstructBinarySearchTreeFromPreorderTraversal {
    int i;
    int[] preorder;

    // Time Complexity: O(N)
    // Space Complexity: O(H)
    public TreeNode bstFromPreorder(int[] preorder) {
        this.i = 0;
        this.preorder = preorder;

        return build(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int min, int max) {
        if(i >= this.preorder.length)
            return null;

        if(this.preorder[i] <= min || this.preorder[i] >= max)
            return null;

        TreeNode root = new TreeNode(this.preorder[i++]);

        root.left = build(min, root.val);
        root.right = build(root.val, max);

        return root;
    }

}