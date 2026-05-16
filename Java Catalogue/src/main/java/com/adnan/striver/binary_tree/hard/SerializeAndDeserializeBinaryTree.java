package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// LeetCode 297: HARD
// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

// Approach:
// For serializing: We use BFS/Level-order traversal, for non-null nodes we append the
// node value for null nodes we append "X" with "_" as separator. In the last, level
// we might have a lot of null's so we can remove them if we want, but it won't be
// an issue coz our deserializer handles it well.
// For Deserializing: We use BFS again, But this time we go over the split array 2 nodes
// at a time except the first one coz that is the node. Those 2 elements from that array
// should not be null before we add them to queue again. We keep moving our needle 2 places
// while processing an element from the queue.

public class SerializeAndDeserializeBinaryTree {

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";

        StringBuilder sb = new StringBuilder();

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int width = q.size();

            while(width-- > 0) {
                TreeNode node = q.poll();

                if(node != null) {
                    q.offer(node.left);
                    q.offer(node.right);
                    sb.append(node.val);
                } else {
                    sb.append("X");
                }
                sb.append("_");
            }
        }

        int i = sb.length() - 1;
        while(i >= 0 && (sb.charAt(i) == 'X' || sb.charAt(i) == '_')) i--;

        return sb.substring(0, i+1);
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;

        String[] nodes = data.split("_");

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        int i = 0;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty() && i <= nodes.length - 1) {
            TreeNode node = q.poll();

            int left = i + 1;
            int right = left + 1;

            if(left <= nodes.length - 1 && !nodes[left].equals("X")) {
                node.left = new TreeNode(Integer.parseInt(nodes[left]));
                q.offer(node.left);
            }

            if(right <= nodes.length - 1 && !nodes[right].equals("X")) {
                node.right = new TreeNode(Integer.parseInt(nodes[right]));
                q.offer(node.right);
            }

            i = right;
        }

        return root;
    }

}