package com.adnan.striver.binary_tree;

import java.util.*;

public class TreeUtils {

    public static Integer[] sort(TreeNode root) {
        if(root == null) return new Integer[] {};

        List<TreeNode> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            list.add(curr);
            curr = curr.right;
        }

        int i = 0;
        Integer[] result = new Integer[list.size()];
        for(TreeNode node: list) {
            result[i++] = node.val;
        }

        return result;
    }

    public static Integer[] toArray(TreeNode root) {
        if(root == null)
            return new Integer[]{};

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            if(node == null) {
                list.add(null);
                continue;
            }

            list.add(node.val);

            q.offer(node.left);
            q.offer(node.right);
        }

        int last = list.size() - 1;

        while(last >= 0 && list.get(last) == null) {
            last--;
        }

        return list.subList(0, last + 1)
                .toArray(new Integer[0]);
    }

    public static TreeNode construct(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        int i = 1;
        while(!q.isEmpty() && i <= arr.length - 1) {
            TreeNode node = q.poll();

            if(i <= arr.length - 1 && arr[i] != null) {
                node.left = new TreeNode(arr[i]);
                q.offer(node.left);
            }

            i++;

            if(i <= arr.length - 1 && arr[i] != null) {
                node.right = new TreeNode(arr[i]);
                q.offer(node.right);
            }

            i++;
        }

        return root;
    }

    public static TreeNode find(TreeNode root, int val) {
        if(root == null) return null;

        Deque<TreeNode> q = new ArrayDeque<>();

        q.offer(root);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            if(node.val == val) return node;

            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
        }

        return null;
    }
}