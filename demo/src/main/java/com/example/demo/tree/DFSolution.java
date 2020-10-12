package com.example.demo.tree;

public class DFSolution extends Thread{
    private Object s = new Object();

    private static class Node{
        //节点值
        public int value;

        //左节点
        public Node left;

        //右节点
        public Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void dfs(Node treeNode){
        if(treeNode!=null){
            return ;
        }
        //process(treeNode);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }


}
