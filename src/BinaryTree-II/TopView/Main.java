import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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

    static class Info{
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
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
        public void TopView(Node root){
            Queue <Info> q = new LinkedList<>();
            HashMap <Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;

            q.add(new Info(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()) break;
                    else q.add(null);
                }else{
                    // first time putting in the map
                    if(!map.containsKey(curr.hd)) map.put(curr.hd, curr.node);
                    if(curr.node.left != null){
                        q.add(new Info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.node.right!=null) {
                        q.add(new Info(curr.node.right,curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.TopView(root);
    }
}