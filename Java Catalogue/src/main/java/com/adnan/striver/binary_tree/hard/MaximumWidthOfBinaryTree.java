package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 662: MEDIUM
// https://leetcode.com/problems/maximum-width-of-binary-tree/

// Approach: We use level order traversal, and calculate the width based on the first and the last element in the queue.
// The question then boils down to how do we calculate the index. For that we have a simple method which is often used for heaps.
// For 0 based indexing:
// left will be 2 * index + 1
// right will be 2 * index + 2
// For 1 based indexing:
// left will be 2 * index
// right will be 2 * index + 1
// While traversing the nodes, we store their index positions as well. So before any level we can calculate the width of that level.

public class MaximumWidthOfBinaryTree {

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int maxWidth = 0;
        Deque<Pair> q = new ArrayDeque<>();
        q.addLast(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair left = q.getFirst();
            Pair right = q.getLast();
            maxWidth = Math.max(maxWidth, right.index - left.index + 1);

            int width = q.size();
            while(width-- > 0) {
                Pair pair = q.removeFirst();
                TreeNode node = pair.node;

                if(node.left != null)
                    q.addLast(new Pair(node.left, 2 * pair.index + 1));
                if(node.right != null)
                    q.addLast(new Pair(node.right, 2 * pair.index + 2));
            }
        }

        return maxWidth;
    }

    private static class Pair {
        TreeNode node;
        int index;

        public Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}