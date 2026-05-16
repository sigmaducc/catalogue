package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// LeetCode 199: MEDIUM
// https://leetcode.com/problems/binary-tree-right-side-view/

// Approach: We use BFS algorithm and only add the last node per level into the list.

public class BinaryTreeRightSideView {

    // Time Complexity: O(N)
    // Space Complexity: O(N + N) ~ O(N)
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        while(!q.isEmpty()) {
            int size = q.size();

            boolean added = false;
            while(size-- > 0) {
                if(!added)
                    list.add(q.getLast().val);

                added = true;
                TreeNode node = q.removeFirst();
                if(node.left != null) q.addLast(node.left);
                if(node.right != null) q.addLast(node.right);
            }
        }

        return list;
    }
}