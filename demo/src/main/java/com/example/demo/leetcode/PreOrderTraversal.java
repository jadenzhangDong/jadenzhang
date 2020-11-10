package com.example.demo.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        //使用栈模拟递归效果
        Stack<TreeNode> toVisit = new Stack<>();
        toVisit.push(root);
        TreeNode cur;
        while(!toVisit.isEmpty()){
            cur = toVisit.pop();
            result.add(cur.val);
            if (cur.right!=null) toVisit.push(cur.right);
            if (cur.left!=null) toVisit.push(cur.left);
        }

        return result;
    }


    public List<Integer> preorderTraversaldigui(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorderHelper(root, result);
        return result;

    }
    private void preorderHelper(TreeNode root, List<Integer> result){
        if(root == null ) return ;
        result.add(root.val);
        preorderHelper(root.left, result);
        preorderHelper(root.right, result);
    }

     /*Definition for a binary tree node.*/
     class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
}
