package com.example.demo.LeetCode;

import org.junit.Test;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int level = 0;
        int  maxDepth = 0;
        if(root == null){
            return 0;
        }
        return dfs(root, maxDepth, level);
    }
    public int dfs(TreeNode node, int maxDepth, int level){
        level += 1;
        maxDepth = level>maxDepth?level:maxDepth;
        if(node.left!=null){
            maxDepth = dfs(node.left, maxDepth, level);
        }
        if(node.right!=null){
            maxDepth = dfs(node.right, maxDepth, level);
        }
        return maxDepth;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    @Test
    public void test(){
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(3);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode4.left = treeNode6;
        treeNode4.right = treeNode7;
        System.out.println(maxDepth(null));
    }
}
