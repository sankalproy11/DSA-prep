public class Main{
    static class Node{
        int data;
        Node left;
        Node right;

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
        public Node build(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
        public Node lowestCommonAncestor(Node root, Node n1, Node n2){
            if(root == null || root.data == n1.data || root.data == n2.data) return root;

            Node leftLCA = lowestCommonAncestor(root.left, n1, n2);
            Node rightLCA = lowestCommonAncestor(root.right, n1, n2);

            if(leftLCA == null) return rightLCA;
            if(rightLCA == null) return leftLCA;
            return root;
        }
        public int lcaDist(Node root, Node n){
            if(root == null) return -1;
            if(root.data == n.data) return 0;
            int lDist = lcaDist(root.left, n);
            int rDist = lcaDist(root.right, n);

            if(lDist == -1 && rDist == -1) return -1;
            else if(lDist == -1) return rDist + 1;
            else return lDist + 1;

        }
        public int minDistance(Node root, Node n1, Node n2){
            Node lca = lowestCommonAncestor(root, n1, n2);
            int dist1 = lcaDist(lca, n1);
            int dist2 = lcaDist(lca, n2);
            return dist1 + dist2;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1 , -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        Node n1 = new Node(4);
        Node n2 = new Node(6);
        System.out.println(tree.minDistance(root, n1, n2));
    }
}