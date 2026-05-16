package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.*;

// LeetCode 236: MEDIUM
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

// Approach 1: We can trace the path of p and q and then match the nodes which are farthest from the root.

// Approach 2: We use recursion to our advantage. We propagate the result from bottom to top. We propagate
// null if the target nodes are not on the path and if it is then we propagate the target node to top.
// So, in the end we just have to check for each node what the left and right results are. If both are null
// we propagate null, if either is not null we propagate that and finally if both are not null that means
// this node is the lowest common ancestor.

public class LowestCommonAncestorOfABinaryTree {

    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null && right == null) {
            return null;
        } else if(left == null) {
            return right;
        } else if(right == null) {
            return left;
        } else {
            return root;
        }
    }

    // Time Complexity: O(N + N + N + N) ~ O(4N) ~ O(N)
    // Space Complexity: O(N + N + N + N) ~ O(4N) ~ O(N)
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Map<Integer, TreeNode> map = new HashMap<>();
//        Deque<TreeNode> queue = new ArrayDeque<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//
//            if(node.left != null) {
//                queue.offer(node.left);
//                map.put(node.left.val, node);
//            }
//
//            if(node.right != null) {
//                queue.offer(node.right);
//                map.put(node.right.val, node);
//            }
//        }
//
//        List<TreeNode> pList = new ArrayList<>();
//        pList.add(p);
//        int key = p.val;
//        while(map.containsKey(key)) {
//            TreeNode node = map.get(key);
//            pList.add(node);
//            key = node.val;
//        }
//
//        List<TreeNode> qList = new ArrayList<>();
//        qList.add(q);
//        key = q.val;
//        while(map.containsKey(key)) {
//            TreeNode node = map.get(key);
//            qList.add(node);
//            key = node.val;
//        }
//
//        TreeNode node = null;
//        int i = pList.size() - 1; int j = qList.size() - 1;
//        while(i >= 0 && j >= 0 && pList.get(i) == qList.get(j)) {
//            node = pList.get(i);
//            i--;
//            j--;
//        }
//
//        return node;
//    }
}