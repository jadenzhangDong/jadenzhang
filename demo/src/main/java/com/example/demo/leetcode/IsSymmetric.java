package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        Queue<Integer> left = new LinkedList<>();
        Queue<Integer> right = new LinkedList<>();
        helper1(root.left, left);
        helper2(root.right, right);
        while(!left.isEmpty() && !right.isEmpty()){
            if(left.poll()!=right.poll()){
                return false;
            }
        }
        if(!left.isEmpty() || !right.isEmpty()) return false;
        return true;
    }

    public void helper1(TreeNode node, Queue<Integer> queue){
        if(node.left!=null){
            helper1(node.left, queue);
        }else{
            queue.add(-1);
        }
        if(node.right!=null){
            helper1(node.right, queue);
        }else{
            queue.add(-1);
        }
        queue.add(node.val);
    }

    public void helper2(TreeNode node, Queue<Integer> queue){
        if(node.right!=null){
            helper2(node.right, queue);
        }else{
            queue.add(-1);
        }
        if(node.left!=null){
            helper2(node.left, queue);
        }else{
            queue.add(-1);
        }
        queue.add(node.val);
    }

    @Test
    public void test(){
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(9);
        TreeNode treeNode11 = new TreeNode(8);
        treeNode5.right = treeNode9;
        treeNode5.left = treeNode8;
        treeNode6.right = treeNode11;
        treeNode6.left = treeNode10;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;


        System.out.println(isSymmetric(treeNode1));
    }
}
