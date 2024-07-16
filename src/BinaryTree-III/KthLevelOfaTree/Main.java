public class Main{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx;;
        public Node buildTree(int[] nodes){
            idx = -1;
            return build(nodes);
        }

        public Node build(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }

        public void kthNodes(Node root, int level, int k){
            if(root == null) return;
            if(k == level){
                System.out.print(root.data+" ");
            }
            kthNodes(root.left, level+1, k);
            kthNodes(root.right, level+1, k);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1 , -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.kthNodes(root, 1, 3);
    }
}