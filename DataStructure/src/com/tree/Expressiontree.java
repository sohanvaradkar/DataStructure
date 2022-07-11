package com.tree;

public class Expressiontree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;

        private String data; // Can be any generic type

        public TreeNode(String data) {
            this.data = data;
        }
    }
    public void createBinaryTree() {

        TreeNode first=new TreeNode("+");
        TreeNode second=new TreeNode("*");
        TreeNode third=new TreeNode("-");
        TreeNode fourth=new TreeNode("4");
        TreeNode five=new TreeNode("5");
        TreeNode six=new TreeNode("6");

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=five;
        third.right=six;

//       +
//   *        -
// 4    5         6
    }

    private static int evalTree(TreeNode root)
    {
        if(root==null)
            return 0;

        int left= evalTree(root.left);
        int right=evalTree(root.right);

        switch (root.data) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            default:
                return Integer.valueOf(root.data);
        }

    }

    public static void main(String[] args) {
        Expressiontree tree=new Expressiontree();
        tree.createBinaryTree();
        System.out.println(evalTree(tree.root));
    }
}
