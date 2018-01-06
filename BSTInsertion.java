/* Structure of BST node */
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null; }
}
class BSTInsertion
{
    Node insert(Node root, int data)
    {
         if(root == null){
             return new Node(data);
         }
         
         if(data < root.data){
             root.left = insert(root.left,data);
         } else if(data > root.data){
             root.right = insert(root.right,data);
         } else
            return root;
        return root;
    }
}
