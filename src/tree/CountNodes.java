package tree;

public class CountNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.left.left.left = new Node(80);
		root.left.left.right = new Node(90);
		root.left.right.left= new Node(100);
		System.out.println(countNodes(root));
		System.out.println(countNodes1(root));

	}
	
	//Naive Solution Theta(n)
	// It works for every tree whether it is complete or not
	public static int countNodes(Node root)
	{
		if(root == null)
			return 0;
		else
			return 1 + countNodes(root.left) + countNodes(root.right);
	}
	
	// Efficient Solution having TC: O(logn * logn)
	public static int countNodes1(Node root)
	{
		int lh = 0 , rh = 0;
		Node curr = root;
		while(curr != null)
		{
			lh++;
			curr = curr.left;
		}
		curr = root;
		while(curr != null)
		{
			rh++;
			curr = curr.right;
		}
		if(lh == rh)
			return (int)Math.pow(2, lh) -1;
		else
			return 1 + countNodes1(root.left) + countNodes1(root.right);
	}

}
