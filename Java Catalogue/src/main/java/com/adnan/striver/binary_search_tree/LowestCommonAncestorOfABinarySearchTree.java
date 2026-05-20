package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 235: MEDIUM
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

// Approach (Iterative 1): We exploit the BST property that everything on the left subtree is smaller
// than current node and everything on the right is greater. If both p & q are smaller than root node
// we move left and if both are greater we move right. If either lies on either side we know we are
// going to depart so we return this node because that node will act like the lowest common ancestor.

// Approach (Iterative 2): We find both p and q in tree and trace their path. Alas, we find the lowest
// common ancestor from both path's.

// Approach (Recursive): We can also treat BST as normal binary tree and check left node if it is null
// we return right subtree and if right node is null we return left subtree and if both are not null
// we know this is the LCA node.

public class LowestCommonAncestorOfABinarySearchTree {

    // Iterative
    // Time Complexity: O(H)
    // Space Complexity: O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if(root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                return root;
            }
        }

        return null;
    }

    // Iterative
    // Time Complexity: O(H + H + H) ~ O(3H)
    // Space Complexity: O(H + H) ~ O(2H)
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(root == null) return null;

    //     List<TreeNode> pList = new ArrayList<>();
    //     TreeNode curr = root;
    //     while(curr != null) {
    //         pList.add(curr);
    //         if(p.val == curr.val) {
    //             break;
    //         } else if(p.val < curr.val) {
    //             curr = curr.left;
    //         } else {
    //             curr = curr.right;
    //         }
    //     }

    //     List<TreeNode> qList = new ArrayList<>();
    //     curr = root;
    //     while(curr != null) {
    //         qList.add(curr);
    //         if(q.val == curr.val) {
    //             break;
    //         } else if(q.val < curr.val) {
    //             curr = curr.left;
    //         } else {
    //             curr = curr.right;
    //         }
    //     }

    //     int i = 0; int j = 0; TreeNode prev = null;
    //     while(i < pList.size() && j < qList.size() && pList.get(i) == qList.get(j)) {
    //         prev = pList.get(i);
    //         i++;
    //         j++;
    //     }

    //     return prev;
    // }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    // private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q) {
    //     if(node == null || node == p || node == q)
    //         return node;

    //     TreeNode left = dfs(node.left, p, q);
    //     TreeNode right = dfs(node.right, p, q);

    //     if(left == null && right == null)
    //         return null;
    //     else if(left == null)
    //         return right;
    //     else if(right == null)
    //         return left;
    //     else
    //         return node;
    // }
}