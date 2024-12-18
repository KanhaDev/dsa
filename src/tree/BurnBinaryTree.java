package tree;

//Directly passing the primitive data type as reference in Java it is not safe
// So here we are creating wrapper class to pass the distance variable as reference
class Distance{
	int val ;
	Distance(int v)
	{
		val = v;
	}
}
public class BurnBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.right = new Node(5);
		root.left.left = new Node(30);
		root.left.left.right = new Node(50);
		root.left.left.left  = new Node(40);
		root.left.left.left.left = new Node(60);
		root.left.left.left.left.left = new Node(70);
	
		Distance dist = new Distance(-1);
		
		burnTime(root,50,dist);
		System.out.println(res);
		

	}
	// res variable is a shared with all the functional calls
	static int res = 0;
	public static int burnTime(Node root , int leaf ,Distance dist)
	{
		if(root == null) return 0;
		
		if(root.key == leaf) {
			dist.val = 0;
			return 1;
		}
		Distance ldist = new Distance(-1);
		Distance rdist = new Distance(-1);
		
		int lh = burnTime(root.left,leaf,ldist);
		int rh = burnTime(root.right,leaf,rdist);
		
		if(ldist.val != -1)
		{
			dist.val = ldist.val +1;
			res = Math.max(res, rh+dist.val);
		}
		else if(rdist.val != -1)
		{
			dist.val = rdist.val +1;
			res = Math.max(res, lh+dist.val);
		}
		
		return Math.max(lh, rh)+1;
	}

}
