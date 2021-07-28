package com.binary;

public class BinarySearchTree 
{
  private TreeNode root;
  private class TreeNode{
	  private int data;
	  private TreeNode left;
	  private TreeNode right;
	 public TreeNode(int data) {
		this.data=data;
	} 
  }
  public void insert(int value)
  {
	  root=insert(root, value);
  }
  public TreeNode insert(TreeNode root,int value)
  {
	  if(root==null)
	  {
		//  System.out.println("null");
		  root=new TreeNode(value);
	      return root;
	  }
	  if(value<root.data)
		  root.left=insert(root.left, value);
	  else
		  root.right=insert(root.right, value);
	  
	  return root;
  }
  public void inOrder(TreeNode root)
  {
	  if(root==null)
		  return;
	  inOrder(root.left);;
	  System.out.print(root.data+" ");
	  inOrder(root.right);
  }
  public TreeNode searchKey(int key)
  {
	  return searchKey(root,key);
  }
  private TreeNode searchKey(TreeNode root, int key) {
	if(root==null||root.data==key)
		return root;
	if(key<root.data)
		return searchKey(root.left, key);
	else
		return searchKey(root.right, key);
	
}
public static void main(String[] args) {
	BinarySearchTree bst=new BinarySearchTree();
	bst.insert(7);
	bst.insert(6);
	bst.insert(1);
	bst.insert(2);
	bst.insert(55);
	//bst.inOrder(bst.root);
	//System.out.println();
	
	if(bst.searchKey(16)!=null)
		System.out.println("key found!!");
	else 
		System.out.println("key not found");
}
}
