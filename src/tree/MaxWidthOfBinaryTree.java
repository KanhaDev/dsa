package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		root.right.left = new Node(54);
		System.out.println(maxWidth(root));

	}
	
	// We will use level order traversal logic to count the width using queue data structure
	
	public static int maxWidth(Node root)
	{
		if(root == null)
			return 0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int res = 0;
		while(q.isEmpty() == false)
		{
			int count = q.size();
			res = Math.max(res, count);
			
			for(int i =0;i<count;i++)
			{
				Node curr = q.poll();
				if(curr.left!= null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
		return res;
		
	}
	

}
