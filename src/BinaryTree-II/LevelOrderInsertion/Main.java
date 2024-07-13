import java.util.*;
public class Main{
    static class Node{
        int data;
        Node right, left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        public Node buildTree(int[] nodes, int idx){
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes, 2*idx+1);
            newNode.right = buildTree(nodes,2*idx+2);
            return newNode;
        }

        public void preOrderTraversal(Node root){
            if(root==null) return;
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        public void levelOrderTraversal(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currentNode = q.remove();
                if(currentNode == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }else{
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left!=null) q.add(currentNode.left);
                    if(currentNode.right!=null) q.add(currentNode.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        // int[] nodes =  {1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] nodes =  {5, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes, 0);
        tree.levelOrderTraversal(root);
        System.out.println();
        tree.preOrderTraversal(root);
    }
}