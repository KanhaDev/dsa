package tree;

import java.util.ArrayList;
import java.util.Iterator;

public class DeserializationSerialization {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.left.left.left = new Node(80);
		root.left.left.right = new Node(90);
		root.left.right.left= new Node(100);
		ArrayList<Integer> arr = new ArrayList<>();
		serialize(root,arr);
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		TreeTraversal.preorder(deSerialize(arr));
	}
	
	// Serialization is the process of converting a binary tree into an array or a string
	//PreOrder Approach root--left--right
	static final int EMPTY = -1;
	public static void serialize(Node root, ArrayList<Integer> arr)
	{
		if(root == null)
		{
			arr.add(EMPTY);
			return;
		}
			arr.add(root.key);
			serialize(root.left,arr);
			serialize(root.right,arr);
	}
	
	// De-Serialization is the process of converting an array or a string into a binary tree
	static int index = 0;
	public static Node deSerialize(ArrayList<Integer> arr)
	{
		if(arr.size() == index) return null;
		
		int val = arr.get(index);
		index++;
		if(val== EMPTY) return null;
		Node root = new Node(val);
		root.left = deSerialize(arr);
		root.right = deSerialize(arr);
		return root;
	}

}
