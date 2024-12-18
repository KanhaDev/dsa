package tree;

import java.util.Stack;

public class IterativeTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);					// 			10
		root.left = new Node(20);					//		   /  \
		root.right = new Node(30);					//		 20	   30
		root.left.left = new Node(40);				//      /  \     \
		root.left.right = new Node(50);				//     /    \     60
		root.left.right.left = new Node(70);		//   40      50
		root.left.right.right = new Node(80);		//          /  \
		root.right.right = new Node(60);			//        70    80
		inOrder(root);
		System.out.println();
		preOrder(root);

	}
	
	//Iterative In order Traversal
	//It will process the left subtree --> root --> right subtree
	// In-order : 40 20 70 50 80 10 30 60
	
	private static void inOrder(Node root)
	{
		Stack<Node>  s = new Stack<>();
		Node curr = root;
		while(curr != null | s.isEmpty() == false)
		{
			while(curr != null)
			{
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.key+" ");
			curr = curr.right;
			
		}
		
	}
	
	//TC : O(n) AS:O(h)
	// Pre-order : 10 20 40 50 70 80 30 60
	private static void preOrder(Node root)
	{
		Stack<Node> s = new Stack<>();
		Node curr = root ;
		while(curr != null | s.isEmpty() == false)
		{
			while(curr != null)
			{
				System.out.print(curr.key +" ");
				s.push(curr.right);
				curr = curr.left;
			}
			if(s.isEmpty() == false)
			curr = s.pop();	
		}
	}

}
