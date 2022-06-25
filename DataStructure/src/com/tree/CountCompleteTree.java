package com.tree;

public class CountCompleteTree {

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

    private  static int countNodes(TreeNode root)
    {
       int lHeight=leftDepth(root);
       int rHeight=rightDepth(root);
       if (lHeight==rHeight)
       return (1<<lHeight)-1;
       else
         return   1+countNodes(root.left)+countNodes(root.right);

    }

    private static int rightDepth(TreeNode root) {
        int dep=0;
        while (root!=null)
        {
            root=root.right;
            dep++;
        }
        return dep;
    }

    private static int leftDepth(TreeNode root) {
        int dep=0;
        while (root!=null) {
            root = root.left;
            dep++;
        }
        return dep;
    }

    public static void main(String[] args) {
        CountCompleteTree tree=new CountCompleteTree();
        tree.createBinaryTree();

        System.out.println(countNodes(tree.root));

    }
}
