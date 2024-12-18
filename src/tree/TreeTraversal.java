package tree;


public class TreeTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		System.out.print("Preorder Traversal: ");
		preorder(root);
		System.out.println();
		System.out.print("Postorder Traversal: ");
		postorder(root);
		System.out.println();
		System.out.print("Inorder Traversal: ");
		inorder(root);
	}
	
	public static void preorder(Node root)
	{
		if(root != null)
		{
			System.out.print(root.key+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void postorder(Node root)
	{
		if(root != null)
		{
			preorder(root.left);
			preorder(root.right);
			System.out.print(root.key+" ");
		}
	}
	public static void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}

}
