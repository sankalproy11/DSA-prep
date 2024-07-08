import java.util.LinkedList;
import java.util.Queue;

public class Main{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        public Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
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
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrderTraversal(root);

    }
}

