package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftView {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		printLeftView2(root);

	}

	//Method 1 to Print Left View of Binary Tree
	
	public static  void printLeftView(Node root)
	{
		printLeft(root , 1);
	}
	static int maxLevel = 0;
	public static  void printLeft(Node root , int level)
	{
		if(root == null) return;
		if(maxLevel < level)
		{
			System.out.print(root.key+" ");
			maxLevel = level;
		}
		printLeft(root.left,level+1);
		printLeft(root.right,level+1);
		
	}
	
	//Method 2 to Print Left View of Binary Tree
	//It is same as Level order traversal using iterative method
	
	public static void printLeftView2(Node root)
	{
		if(root == null) return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(q.isEmpty() == false)
		{
			int size = q.size();
			for(int i = 0 ;i<size;i++)
			{
				Node curr = q.poll();
				if(i == 0)
				{
					System.out.print(curr.key+" ");
				}
				if(curr.left != null) q.add(curr.left);
				if(curr.right != null) q.add(curr.right);
			}
			
		}
	}
}
