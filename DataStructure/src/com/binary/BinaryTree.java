package com.binary;

import java.util.LinkedList;
import java.util.Queue;
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
		TreeNode third=new TreeNode(10);
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
	public static void inOrderRecursive(TreeNode root) {
		if(root==null)
			return;
		
		inOrderRecursive(root.left);
		System.out.print(root.data+" ");
		inOrderRecursive(root.right);
		
	}
	public void inOrderIterative() {
		if(root==null)
			return;
		
		Stack<TreeNode> stack =new Stack<>();
		TreeNode temp=root;
		while (!stack.isEmpty()||temp!=null) {
			if(temp!=null)
			{
				stack.push(temp);
			    temp=temp.left;
			}
			else
			{
				temp=stack.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
			
			
		}
	
	}

	public void postOrderRecursive(TreeNode root) {
		if(root==null)
			return ;
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data+" ");
		
	}
	public void postOrderIterative() {
		
		TreeNode current=root;
        Stack<TreeNode> stack =new Stack<TreeNode>();
        while (current!=null||!stack.isEmpty()) {
        if (current!=null) {
        	stack.push(current);
        	current=current.left;	
		}
        else {
        	TreeNode temp=stack.peek().right;
        	if (temp==null) {
        		temp=stack.pop();
        		System.out.print(temp.data+" ");
        		while (!stack.isEmpty()&&temp==stack.peek().right) {
        			temp = stack.pop();
					System.out.print(temp.data + " ");
				}
        		
				
			}else {
				current = temp;
        }
        }
	}
  }
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
	public int findMax(TreeNode root)
	{
		if(root==null)
			return Integer.MIN_VALUE;
		
		int result=root.data;
		int left=findMax(root.left);
		int right=findMax(root.right);
		
		if(left>result)
			result=left;
		
		if(right>result)
			result=right;
		
		return result;
		
	}
	public static void main(String[] args) {

     BinaryTree tree=new BinaryTree();
     tree.createBinaryTree();
    // tree.preOrderRecursive(tree.root);
     //tree.preOrderIterative();
    // tree.inOrderRecursive(tree.root);
     //tree.inOrderIterative();
     //tree.postOrderIterative();
    // findMax
     System.out.println(tree.findMax(tree.root));

	}

}

