class Node {
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
}


class BSTDeletionRecursive
{
    public static Node minValueNode(Node root) {
        Node current = root;
        while(current.left != null)
            current = current.left;
        return current;
    }
    
    Node deleteNode(Node root, int key) 
    {
        if(root == null)
            return root;
        
	    if(key < root.key) {
	        root.left = deleteNode(root.left,key);
	    } else if(key > root.key) {
	        root.right = deleteNode(root.right,key);
	    } else {
	        if (root.left == null)
	            return root.right;
	        else if(root.right == null)
	            return root.left;
	        else {
	            Node minValue = minValueNode(root.right);
	            root.key = minValue.key;
	            root.right = deleteNode(root.right,minValue.key);
	        }
	    }
	    return root;
    }
}
