package tree;

public class PrintKDistance {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		printKdistance(root, 2);

	}
	
	public static void printKdistance(Node root, int k)
	{
		if(root == null)
			return;
		if(k == 0)
		{
			System.out.print(root.key+" ");
		}
		else {
			printKdistance(root.left,k-1);
			printKdistance(root.right,k-1);
		}
	}

}
