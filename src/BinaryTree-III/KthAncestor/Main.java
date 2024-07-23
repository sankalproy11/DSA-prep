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
        static int idx;
        public Node buildTree(int[] nodes){
            idx = -1;
            return build(nodes);
        }
        private Node build(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
        public int kAncestor(Node root, Node n, int k){
            if(root == null) return -1;
            if(root.data == n.data) return 0;

            int leftDist = kAncestor(root.left, n, k);
            int rightDist = kAncestor(root.right, n, k);

            if(leftDist == -1 && rightDist == -1) return -1;
            int max = Math.max(leftDist, rightDist);
            if(max + 1 == k) System.out.println(root.data);
            return max + 1;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1 , -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        Node n = new Node(5);
        int k = 2;
        tree.kAncestor(root, n, k);
    }
}