package com.example.demo.LeetCode;

import org.junit.Test;

public class SumNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);

    }

    public int helper(TreeNode root, int i){
        if (root == null) return 0;
        int temp = i * 10 + root.val;
        if (root.left == null && root.right == null)
            return temp;
        return helper(root.left, temp) + helper(root.right, temp);
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

  @Test
  public void test(){
      TreeNode treeNode = new TreeNode(1);
      treeNode.left = new TreeNode(2);
      treeNode.right = new TreeNode(3);
      System.out.println(sumNumbers(treeNode));

  }
}
