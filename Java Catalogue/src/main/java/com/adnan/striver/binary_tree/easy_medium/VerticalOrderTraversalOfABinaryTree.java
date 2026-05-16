package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.*;

// LeetCode 987: HARD
// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

// Approach 1: We separate the nodes into buckets based on their columns. So we use Map. Since we want
// everything sorted by cols we will use treemap. Key of map is col but the value will be a heap because
// at each key in map we need to sort the elements by col first and if col is same then we sort by row
// and at last sort by node value. Alas, we iterate over the map and put all the elements from heap into
// the list key by key.

// Approach 2: We maintain a nodes list and keep pushing all the nodes in it. We sort it first by col, if
// col is same then we sort by row, and if row is same then we sort by node value. Then we insert into the
// list for all the nodes which have same col. Moment we find different col we add another list to our final list.

public class VerticalOrderTraversalOfABinaryTree {

    // Time Complexity: O(N + N log N + N) ~ O(2N + N log N)
    // Space Complexity: O(N + N + N) ~ O(N)
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Deque<Cell> q = new ArrayDeque<>();
        List<Cell> nodes = new ArrayList<>();
        q.offer(new Cell(root, 0, 0));
        while(!q.isEmpty()) {
            Cell cell = q.poll();
            TreeNode node = cell.node;

            nodes.add(new Cell(node, cell.row, cell.col));

            if(node.left != null)
                q.offer(new Cell(node.left, cell.row + 1, cell.col - 1));

            if(node.right != null)
                q.offer(new Cell(node.right, cell.row + 1, cell.col + 1));
        }

        nodes.sort((a, b) -> {
            if (a.col != b.col)
                return a.col - b.col;

            if(a.row != b.row)
                return a.row - b.row;

            return a.node.val - b.node.val;
        });

        int prevCol = Integer.MIN_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        for(Cell cell: nodes) {
            int col = cell.col;
            TreeNode node = cell.node;

            if(prevCol != col) {
                list.add(new ArrayList<>());
                prevCol = col;
            }

            list.getLast().add(node.val);
        }

        return list;
    }

    // Time Complexity: O(N + N log N + N log N + N log N) ~ O(N + 3 * N log N) ~ O(N log N)
    // Space Complexity: O(N + N + N) ~ O(N)
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        if(root == null) return new ArrayList<>();
//
//        Deque<Cell> q = new ArrayDeque<>();
//        Map<Integer, PriorityQueue<Cell>> map = new TreeMap<>();
//        q.offer(new Cell(root, 0, 0));
//        while(!q.isEmpty()) {
//            Cell cell = q.poll();
//            TreeNode node = cell.node;
//
//            if(node.left != null)
//                q.offer(new Cell(node.left, cell.row + 1, cell.col - 1));
//
//            if(node.right != null)
//                q.offer(new Cell(node.right, cell.row + 1, cell.col + 1));
//
//
//            if(!map.containsKey(cell.col))
//                map.put(cell.col, new PriorityQueue<>((a, b) -> {
//                    if(a.row != b.row)
//                        return a.row - b.row;
//
//                    return a.node.val - b.node.val;
//                }));
//
//            map.get(cell.col).add(cell);
//        }
//
//        List<List<Integer>> list = new ArrayList<>();
//        for(PriorityQueue<Cell> heap: map.values()) {
//            List<Integer> l = new ArrayList<>();
//            while(!heap.isEmpty()) {
//                Cell cell = heap.poll();
//                l.add(cell.node.val);
//            }
//
//            list.add(l);
//        }
//
//        return list;
//    }

    private static class Cell {
        TreeNode node;
        int row;
        int col;

        public Cell(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }

        public String toString() {
            return "Cell(node=" + node.val + ", row=" + row + ", col=" + col +")";
        }
    }
}