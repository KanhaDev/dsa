package tree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);					// 			10
		root.left = new Node(20);					//		   /  \
		root.right = new Node(30);					//		 20	   30
		root.left.left = new Node(40);				//      /  \     \
		root.left.right = new Node(50);				//     /    \     60
		root.left.right.left = new Node(70);		//   40      50
		root.left.right.right = new Node(80);		//          /  \
		root.right.right = new Node(60);			//        70    80
		
		System.out.println("Height of Tree is : "+height(root));
	}
	
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		else {
			return Math.max(height(root.left), height(root.right))+1;
		}
	}

}
