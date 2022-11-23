package com.binary;

class Node{
	int value;
	Node left,right;
	public Node(int value) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTree {
	Node root;
	
	public Node addElement(Node current, int value) {
		if (current == null) {
			System.out.println("Node " + value);
			return new Node(value);
		}
		
		if (value>current.value) {
			System.out.println("current right : "+ current.value+ " value : "+value);
			current.right = addElement(current.right,value);
			
		}else if (value<current.value) {
			System.out.println("current left : "+current.value+ " value : "+value);
			current.left = addElement(current.left, value);
		}else {
			return current;
		}
		System.out.println("current"+current.value);
		return current;
	}
	
	public void add(int value) {
		root = addElement(root, value);
		System.err.println("Root : "+root.value);
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add(56);
		bt.add(30);
		bt.add(70);
		bt.add(22);
		bt.add(40);
		bt.add(60);
		bt.add(95);
	}
}
