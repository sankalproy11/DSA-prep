import java.util.ArrayList;

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
        public Node lowestCommonAncestor(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i<path2.size(); i++) {
                if(path1.get(i) != path2.get(i)) break;
            }

            Node lca = path1.get(i - 1);
            return lca;
        }
        public boolean getPath(Node root, int n, ArrayList<Node> path){
            if(root == null) return false;

            path.add(root);

            if(root.data == n){
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if(foundLeft || foundRight){
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1 , -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        Node lca = tree.lowestCommonAncestor(root, 4, 5);
        System.out.println(lca.data);
    }
}