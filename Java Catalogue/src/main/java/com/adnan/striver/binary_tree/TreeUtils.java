package com.adnan.striver.binary_tree;

import java.util.*;

public class TreeUtils {

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

    public static void printTree(TreeNode root) {
        printTree(root, 0);
    }

    private static void printTree(TreeNode node, int level) {

        if (node == null)
            return;

        printTree(node.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        System.out.println(node.val);

        printTree(node.left, level + 1);
    }
}