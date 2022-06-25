package com.tree;

public class InvertTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data; // Can be any generic type

        public TreeNode(int data) {
            this.data = data;
        }
    }



    public void createBinaryTree() {

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

    private TreeNode reverseTree(TreeNode root)
    {
        if (root!=null)
        {
            TreeNode left=reverseTree(root.right);
            TreeNode right=reverseTree(root.left);

            root.left=left;
            root.right=right;
        }
        return root;
    }
    void inOrder(TreeNode node)
    {
        //System.out.println(node.data);
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    public static void main(String[] args) {
        InvertTree it=new InvertTree();
        it.createBinaryTree();
        it.inOrder(it.root);
        System.out.println();
        it.reverseTree(it.root);
        it.inOrder(it.root);
    }
}
