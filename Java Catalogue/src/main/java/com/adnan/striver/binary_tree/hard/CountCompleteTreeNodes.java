package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 222: EASY
// https://leetcode.com/problems/count-complete-tree-nodes/

// Approach: We check the height of left and right subtree. If they are same that means the tree is perfect,
// and we can return the number of nodes in that tree using this formula: 2^(h+1) - 1 where h is the height
// of that tree/subtree. If it is not perfect then we keep recursing. So, our function does 2 things it
// returns the height of the tree at first but before that it needs to check the left and right subtree height.
// Again, if they are same we return 2^(h+1) - 1 else we recurse further.

// NOTE: 1 + 2 + 4 + 8 + 16 + .... + 2^n = 2^(n+1) - 1

// PROOF:
//      S  = 1 + 2 + 4 +  8 + 16 + .... + 2^(n-1) + 2^n
//      2S = 2 + 4 + 8 + 16 + 32 + .... + 2^n     + 2^(n+1)
// 2S - S  = 2^(n+1) - 1

// NOTE: S = 2^(n+1) - 1

public class CountCompleteTreeNodes {

    // Recursive
    // Time Complexity: O(log N * log N)
    // Space Complexity: O(log N)
    public int countNodes(TreeNode root) {
        return count(root);
    }

    private int count(TreeNode root) {
        if(root == null) return 0;

        TreeNode node = root;

        int left = 0;
        while(node.left != null) {
            left++;
            node = node.left;
        }

        int right = 0;
        node = root;
        while(node.right != null) {
            right++;
            node = node.right;
        }

        if(left == right)
            return (1 << (left+1)) - 1;

        return 1 + count(root.left) + count(root.right);
    }

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    // public int countNodes(TreeNode root) {
    //     if(root == null) return 0;

    //     int count = 0;
    //     Deque<TreeNode> q = new ArrayDeque<>();
    //     q.offer(root);
    //     while(!q.isEmpty()) {
    //         int width = q.size();

    //         while(width-- > 0) {
    //             TreeNode node = q.poll();

    //             count++;
    //             if(node.left != null) q.offer(node.left);
    //             if(node.right != null) q.offer(node.right);
    //         }
    //     }

    //     return count;
    // }
}