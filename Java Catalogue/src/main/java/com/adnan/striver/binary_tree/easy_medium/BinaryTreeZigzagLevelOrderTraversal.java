package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.*;

// LeetCode 103: MEDIUM
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

// Approach: We do use BFS (level-order) traversal and simply keep adding
// elements to the list level by level. At each level we switch the order
// of elements per level.

public class BinaryTreeZigzagLevelOrderTraversal {

    // Time Complexity: O(N)
    // Space Complexity: O(N + N + N)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        boolean direction = true;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> l = new LinkedList<>();
            while(size-- > 0) {
                TreeNode node = q.poll();

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);

                if(direction)
                    l.addLast(node.val);
                else
                    l.addFirst(node.val);
            }

            list.add(l);
            direction = !direction;
        }

        return list;
    }
}