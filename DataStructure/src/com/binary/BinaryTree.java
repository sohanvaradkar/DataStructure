package com.binary;

import java.util.Stack;

import com.queue.Queue.ListNode;

public class BinaryTree {
	TreeNode root;
	
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data) {
			this.data=data;
			
		}
	}
	public void createBinaryTree() {
		TreeNode first=new TreeNode(9);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		
		
		root=first;//root-->first
		first.left=second;
		first.right=third; //second <----first---->third
		
		second.left=fourth;//fourth<----second---->fifth

	}
	//Print Recursive Way
	private void preOrderRecursive(TreeNode root) {
		if(root==null)
			return ;
		
		System.out.print(root.data+" ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
	}
	//Print Iterative Way
	private void preOrderIterative() {
		if(root==null)
			return;
		
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while (!stack.empty()) {
			TreeNode temp=stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
				stack.push(temp.right);
			
			if(temp.left!=null)
				stack.push(temp.left);
		}
		
	}

	public static void main(String[] args) {

     BinaryTree tree=new BinaryTree();
     tree.createBinaryTree();
     tree.preOrderRecursive(tree.root);
     tree.preOrderIterative();

	}

}
