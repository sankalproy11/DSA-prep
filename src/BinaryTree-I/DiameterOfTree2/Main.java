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
        static int idx = -1;
        public Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] ==-1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public Info diameterAndHeight(Node root){
            if(root == null) return new Info(0,0);
            Info leftDiam = diameterAndHeight(root.left);
            Info rightDiam = diameterAndHeight(root.right);

            int diam = Math.max(leftDiam.ht+rightDiam.ht+1, Math.max(leftDiam.diam, rightDiam.diam));
            int ht = Math.max(leftDiam.ht, rightDiam.ht) + 1;
            return new Info(diam, ht);
        }
    }

    static class Info{
        int diam;
        int ht;
        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The diameter is: "+tree.diameterAndHeight(root).diam);
        System.out.println("The height is: "+tree.diameterAndHeight(root).ht);
    }
}