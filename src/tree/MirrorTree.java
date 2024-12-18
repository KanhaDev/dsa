package tree;

public class MirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
//        root.left.left = new Node(40);
        mirror(root);

	}
	public static void mirror(Node node) {
        // Your code here
        if(node == null)
            return;
        if(node.right != null) mirror(node.right);
        System.out.print(node.key+" ");
        if(node.left != null) mirror(node.left);
    }

}
