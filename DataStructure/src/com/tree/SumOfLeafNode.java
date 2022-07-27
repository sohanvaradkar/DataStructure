package com.tree;



public class SumOfLeafNode {


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

    public int sumOfLeaf()
    {
        return sumOfLeaf(root,0);
    }

    private int sumOfLeaf(TreeNode root, int curSum) {

        if (root==null)
            return 0;

        if (root.left==null && root.right==null)
            return curSum*10+root.data;

        return sumOfLeaf(root.left,curSum*10+root.data)+sumOfLeaf(root.right,curSum*10+root.data);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sumOfLeaf(root,0,targetSum);
    }
    public boolean sumOfLeaf(TreeNode root,int curSum, int targetSum)
    {

        if(root==null)
            return false;

        curSum=curSum+root.data;
        if(curSum==targetSum&&root.right==null&&root.left==null)
        {
                return true;
        }

        return (sumOfLeaf(root.left,curSum,targetSum)||
                sumOfLeaf(root.right,curSum,targetSum));
    }
    public static void main(String[] args) {
        SumOfLeafNode leaf=new SumOfLeafNode();
        leaf.createBinaryTree();

        System.out.println(leaf.hasPathSum(leaf.root,8));

    }
}
