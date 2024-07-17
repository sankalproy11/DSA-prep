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

            Node leftLca = lowestCommonAncestor(root.left, n1, n2);
            Node rightLca = lowestCommonAncestor(root.right, n1, n2);
            if(leftLca == null) return rightLca; 
            if(rightLca == null) return leftLca; 
            return root;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1 , -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        System.out.println(tree.lowestCommonAncestor(root, n1, n2).data);
    }

}