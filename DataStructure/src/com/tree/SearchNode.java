package com.tree;

public class SearchNode 
{
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

        TreeNode first=new TreeNode(4);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(5);
        TreeNode fourth=new TreeNode(1);
        TreeNode five=new TreeNode(3);
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


    private TreeNode searchBST(TreeNode root,int val)
    {
        if (root==null) return  null;
        if (root.data==val) return root;
       else if (root.data>val) return searchBST(root.left,val);
        else  return searchBST(root.right,val);



    }
    public static void main(String[] args) {

        SearchNode node=new SearchNode();
        node.createBinaryTree();
        System.out.println(node.searchBST(node.root,2));

    }
}
