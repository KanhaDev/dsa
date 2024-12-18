package tree;

//class Node{
//	int key;
//	Node left;
//	Node right;
//	
//	public Node(int k)
//	{
//		key = k;
//	}
//	
//}
public class BalancedBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
//		root.right.right = new Node(60);
		System.out.println(isBalanced(root));
		int balancedCheck = isBalanced2(root);
		if(balancedCheck>=0)
			System.out.println(true);
		else
			System.out.println(false);
	}
	
	//Naive Solution taking n*n Time Complexity
	public static boolean isBalanced(Node root)
	{
		if(root == null)
			return true;
		int lh = HeightOfBinaryTree.height(root.left);
		int rh = HeightOfBinaryTree.height(root.right);
		return (Math.abs(lh-rh) <=1 && isBalanced(root.left) && isBalanced(root.right));
		
	}
	
	//Efficient Solution taking O(n) Time Comlexity
	
	public static int isBalanced2(Node root)
	{
		if(root == null)
			return 0;
		int lh = isBalanced2(root.left);
		if(lh == -1)
			return -1;
		int rh = isBalanced2(root.right);
		if(rh == -1)
			return -1;
		if(Math.abs(rh-lh)>1)
			return -1;
		else
			return (int) Math.max(rh,lh)+1;
		
	}
	

}
