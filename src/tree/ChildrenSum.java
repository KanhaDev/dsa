package tree;

public class ChildrenSum {

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(7);
		root.right.right = new Node(5);
//		root.right.right = new Node(60);
		System.out.println(isChildSum(root));
		

	}
	public static boolean isChildSum(Node root)
	{
		
		if(root == null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		int sum = 0;
		if(root.left!=null)
			sum = sum+root.left.key;
		if(root.right!=null)
			sum = sum+root.right.key;
		return (sum == root.key && isChildSum(root.left) && isChildSum(root.right));
		
	}

}
