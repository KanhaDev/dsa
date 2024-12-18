package tree;

import java.util.ArrayList;

//Lowest Common Ancestors
public class LCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		
		System.out.println(lca(root,60,30).key);
		System.out.println(lcaN(root,60,30).key);
		System.out.println(lcaL(root,root.right.right,root.right).key);
		
		System.out.println(lca(root,70,60).key);
		System.out.println(lcaN(root,70,60).key);
		System.out.println(lcaL(root,root.left.right.left,root.right.right).key);
		
		System.out.println(lca(root,70,80).key);
		System.out.println(lcaN(root,70,80).key);
		System.out.println(lca(root,40,80).key);
		System.out.println(lcaN(root,40,80).key);
		//niche case k lie 60 answer aa rha jo galat hai Qki isme assume kiya gya hai ki dono node exist krte hai tree m
		System.out.println(lcaN(root,60,100).key);
		System.out.println(lca(root,60,100).key);
		
	}
	
	//Naive Solution TC: O(n) && AS:O(n)
	public static Node lca(Node root ,int n1,int n2)
	{
		ArrayList<Node> path1 = new ArrayList<>();
		ArrayList<Node> path2 = new ArrayList<>();
		
		if(findPath(root,path1,n1) == false || findPath(root,path2,n2) == false)
			return null;
		// Path 1 = [1,3,9]
		// Path 2 = [1,3]
		for(int i = 0;i<path1.size()-1 && i<path2.size()-1;i++)
		{
			if(path1.get(i+1) != path2.get(i+1))
				return path1.get(i);
			else if(path1.get(i+1).key == n1){
				return path1.get(i+1);
			}
			else if(path2.get(i+1).key == n2)
			{
				return path2.get(i+1);
			}
		}	
		return null;
	}
	
	public static boolean findPath(Node root,ArrayList<Node> path , int n)
	{
		if(root == null) return false;
		path.add(root);
		if(root.key == n) return true;
		if(findPath(root.left,path,n) || findPath(root.right,path,n))
			return true;
		path.remove(path.size()-1);
		return false;
			
	}
	
	//Efficient Solution TC: O(n) & AS:O(h)
	// Assume kar rhe hai ki dono node exist krte hai
	public static Node lcaN(Node root , int n1 , int n2)
	{
		if(root == null)
			return null;
		if(root.key == n1 || root.key == n2)
			return root;
		Node lca1 = lcaN(root.left,n1,n2);
		Node lca2 = lcaN(root.right,n1,n2);
		
		if(lca1 != null && lca2 != null)
			return root;
		if(lca1 != null)
			return lca1;
		else
			return lca2;
	}
	
	// Ek or solution hai jo love babbar bhaiya ka hai
	public static Node lcaL(Node root, Node n1 , Node n2)
	{
		if(root == null)
			return null;
		if(root.key == n1.key)
			return n1;
		if(root.key == n2.key)
			return n2;
		Node leftAns = lcaL(root.left,n1,n2);
		Node rightAns = lcaL(root.right,n1,n2);
		if(leftAns == null && rightAns == null)
			return null;
		else if(leftAns != null && rightAns == null)
			return leftAns;
		else if(rightAns != null && leftAns == null)
			return rightAns;
		else
			return root;
	}

}
