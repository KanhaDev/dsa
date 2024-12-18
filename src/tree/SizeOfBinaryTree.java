package tree;

public class SizeOfBinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		System.out.println("Size of Binary Tree: " + getSize(root));
		
	}
	public static int getSize(Node root)
	{
		if(root == null)
			return 0;
		else
			return 1+getSize(root.left)+getSize(root.right);
			
	}

}
