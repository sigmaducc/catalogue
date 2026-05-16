package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.*;

// LeetCode 863: MEDIUM
// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

// Approach: We need to convert this problem to a graph problem. We do that by maintaining a parent reference using a map.
// Once we have the parent references, we can go ahead and do level order traversal from the target node. But this time
// our level will consist of left, right and parent instead of just left and right. Since, we have turned this problem
// into an undirected graph problem we need to know which nodes are visited so we maintain a visited nodes array/set.
// So, after each level order traversal we will know the depth from target node. When the depth/distance becomes k
// we can exit and return the elements from the queue. Coz the queue will only contain the nodes at level K.

public class AllNodesDistanceKInBinaryTree {

    // Time Complexity: O(N + N) ~ O(2N) ~ O(N)
    // Space Complexity: O(N + N + N + N) ~ O(4N) ~ O(N)
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root == null) return new ArrayList<>();

        TreeNode[] parents = new TreeNode[501];
        Arrays.fill(parents, null);

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int width = q.size();

            while(width-- > 0) {
                TreeNode node = q.poll();

                if(node.left != null) {
                    q.offer(node.left);
                    parents[node.left.val] = node;
                }
                if(node.right != null) {
                    q.offer(node.right);
                    parents[node.right.val] = node;
                }
            }
        }

        int distance = 0;
        boolean[] visited = new boolean[501];
        Arrays.fill(visited, false);

        q.offer(target);
        visited[target.val] = true;
        while(!q.isEmpty()) {
            int width = q.size();

            if(distance == k) break;

            while(width-- > 0) {
                TreeNode node = q.poll();

                TreeNode left = node.left;
                TreeNode right = node.right;
                TreeNode parent = parents[node.val];

                if(left != null && !visited[left.val]) {
                    q.offer(left);
                    visited[left.val] = true;
                }
                if(right != null && !visited[right.val]) {
                    q.offer(right);
                    visited[right.val] = true;
                }
                if(parent != null && !visited[parent.val]) {
                    q.offer(parent);
                    visited[parent.val] = true;
                }
            }

            distance++;
        }

        List<Integer> list = new ArrayList<>();
        for(TreeNode node: q)
            list.add(node.val);

        return list;
    }
}