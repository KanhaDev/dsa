package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CountKDistantfromLeaf {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
//		System.out.println(printKDistantfromLeaf(root,2));
	}

	HashSet<Node> set = new HashSet<>();
    void solve(Node root, int k , ArrayList<Node> arr)
    {
        if(root == null)
            return;
        arr.add(root);
        if(root.left == null && root.right == null)
        {
            int n = arr.size();
            if(n-1>=k)
                set.add(arr.get(n-1));
            arr.remove(n-1);
        }
        solve(root.left,k,arr);
        solve(root.right,k,arr);
        
    }
    
    //Incomplete please check gfg Jyotsana 
    int printKDistantfromLeaf(Node root, int k)
    {
        ArrayList<Node> arr = new ArrayList<Node>();
        solve(root,k,arr);
        Iterator<Node> node = set.iterator();
        while(node.hasNext())
        {
            System.out.print(node.next().key+" ");
        }
        return set.size();
        
    }
    

}
