package tree;

public class MaxInBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		System.out.println("Maximum Value is: "+maxValue(root));
		
	}
	
	public static int maxValue(Node root)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		else
			return (int)Math.max(root.key, Math.max(maxValue(root.left), maxValue(root.right)));
	}

}
