//package com.tree;
//
//public class ValidatTree {
//
//    public boolean isValid(TreeNode root)
//    {
//        return  isValidBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
//    }
//
//    private boolean isValidBst(TreeNode root, long minValue, long maxValue) {
//        if (root==null) return true;
//        if (maxValue>=root.val&&minValue>=root.val)
//            return  false;
//
//        return isValidBst(root.left,minValue,root.val)&&isValidBst(root.right,root.val,maxValue);
//    }
//}
