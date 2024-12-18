package tree;
import tree.tree01;

public class inorder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        //In order Traversal

        inorderTraversal(root);
    }
    public static void inorderTraversal(Node root)
    {
        if(root!=null)
        {
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.right);
        }
    }
}
