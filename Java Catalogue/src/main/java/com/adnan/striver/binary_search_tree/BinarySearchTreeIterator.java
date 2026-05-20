package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 173: MEDIUM
// https://leetcode.com/problems/binary-search-tree-iterator/

// Approach 1: We again use Morris Inorder Traversal
// Approach 2: We use normal inorder traversal

public class BinarySearchTreeIterator {

    TreeNode curr;

    public BinarySearchTreeIterator(TreeNode root) {
        this.curr = root;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public int next() {
        int val = -1;

        while(this.hasNext()) {
            if(this.curr.left == null) {
                val = this.curr.val;
                this.curr = this.curr.right;
                break;
            } else {
                TreeNode next = this.curr.left;
                while(next.right != null && next.right != this.curr) {
                    next = next.right;
                }

                if(next.right == null) {
                    next.right = this.curr;
                    this.curr = this.curr.left;
                } else {
                    next.right = null;
                    val = this.curr.val;
                    this.curr = this.curr.right;
                    break;
                }
            }
        }

        return val;
    }

    public boolean hasNext() {
        return this.curr != null;
    }
}


// class BinarySearchTreeIterator {
//     TreeNode curr;
//     Deque<TreeNode> stack;

//     public BinarySearchTreeIterator(TreeNode root) {
//         this.curr = root;
//         this.stack = new ArrayDeque<>();
//     }

    // Time Complexity: O(N)
    // Space Complexity: O(H)
//     public int next() {
//         int val = -1;
//         while(this.hasNext()) {
//             while(this.curr != null) {
//                 this.stack.push(this.curr);
//                 this.curr = curr.left;
//             }
//             this.curr = this.stack.pop();
//             val = this.curr.val;
//             this.curr = this.curr.right;
//             break;
//         }

//         return val;
//     }

//     public boolean hasNext() {
//         return this.curr != null || !this.stack.isEmpty();
//     }
// }