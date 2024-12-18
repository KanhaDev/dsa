package tree;

import java.util.HashMap;

public class Diameter {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		
		System.out.println(diameter(root));
		System.out.println(diameter2(root));
		System.out.println(diameter3(root));
	}
	//Naive Solution O(n*n)
	public static int diameter(Node root)
	{
		if(root == null) return 0;
		int d1 = 1 + HeightOfBinaryTree.height(root.left)+ HeightOfBinaryTree.height(root.right);
		int d2 = diameter(root.left);
		int d3 = diameter(root.right);
		return Math.max(d1,Math.max(d2, d3));
	}
	
	//Better Solution TC: O(n) & AS: O(n)
	public static int diameter2(Node root)
	{
		HashMap<Node,Integer> map = new HashMap<>();
		
		return calDiameter(root,map);
	}
	
	public static int height(Node root , HashMap<Node,Integer> map)
	{
		if(root == null)
			return 0;
		if(map.containsKey(root)) return map.get(root);
		int leftHeight = height(root.left,map);
		int rightHeight = height(root.right,map);
		
		int heightCal = 1 + Math.max(leftHeight, rightHeight);
		
		map.put(root, heightCal);
		
		return heightCal;
	}
	
	public static int calDiameter(Node root , HashMap<Node,Integer> map)
	{
		if(root == null)
			return 0;
		int d1 = 1 + height(root.left,map) + height(root.right,map);
		
		int d2 = calDiameter(root.left,map);
		int d3 = calDiameter(root.right,map);
		
		return Math.max(d1, Math.max(d2, d3));
	}
	
	// Efficient Solution O(n) Time Complexity and no overhead of map
	
	static int res = 0;
	 public static int height2(Node root)
	 {
		 if(root ==  null) return 0;
		 
		 int lh = height2(root.left);
		 int rh = height2(root.right);
		 
		 res = Math.max(res, lh+rh+1);
		 return 1+ Math.max(lh, rh); 
	 }
	 
	 public static int diameter3(Node root)
	 {
		 height2(root);
		 return res;
	 }
}
