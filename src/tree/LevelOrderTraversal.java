package tree;

//Level order traversal can be seen as mix of two methods
//1. find the height of the tree
//2. print nodes at K distance

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		int n = HeightOfBinaryTree.height(root);
		
		for(int i = 0;i<n;i++)
		{
			PrintKDistance.printKdistance(root, i);
		}

	}

}
