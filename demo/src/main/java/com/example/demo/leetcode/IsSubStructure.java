package com.example.demo.LeetCode;

public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {

        //递归退出条件
        if(A==null) return false;

        if(helper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B)) return true;
        return false;
    }

    public boolean helper(TreeNode A, TreeNode B){
        if(B==null) return true;
        if(A == null ||A.val != B.val) return false;
        if(helper(A.left, B.left) && helper(A.right, B.right)) return true;
        return false;
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


}
