package com.practice;

import com.tree.BinaryTree;

import java.util.Stack;

public class BinaryTreeDemo
{
    private TreeNode root;

    private class  TreeNode{
        private TreeNode left;
        private  TreeNode right;
        private int data;

        public TreeNode(int data)
        {
            this.data=data;
        }

    }

    private void createBinaryTree()
    {
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode five=new TreeNode(5);
        TreeNode six=new TreeNode(6);



       root=first;
       first.left=second;
       first.right=third;
       second.left=fourth;
       second.right=five;
       third.right=six;

//       1
//   2        3
// 4    5         6

    }

    private   void  preOrder(TreeNode root)
    {
        if (root==null)
            return;

        System.out.print(" "+root.data); // 1 2 4 5 3 6
        preOrder(root.left);
        preOrder(root.right);
    }
    private void preOrder()
    {
        if (root==null)
            return;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode temp=stack.pop();
            System.out.print(" "+temp.data); //// 1 2 4 5 3 6
            if (temp.right!=null)
                stack.push(temp.right);
            if (temp.left!=null)
                stack.push(temp.left);
        }
    }

    private void inOrder(TreeNode root)
    {
        if(root==null)
            return;

        inOrder(root.left);
        System.out.print(" "+root.data);  //4 2 5 1 3 6
        inOrder(root.right);

    }
    private  void inOrder()
    {
        if(root==null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " "); ////4 2 5 1 3 6
                temp = temp.right;
            }
        }
    }
    public static void main(String[] args) {
        BinaryTreeDemo bt=new BinaryTreeDemo();
        bt.createBinaryTree();
       //bt.preOrder(bt.root);  //Time Complexity: O(n)
        //bt.preOrder();
        bt.inOrder();
    }

}
