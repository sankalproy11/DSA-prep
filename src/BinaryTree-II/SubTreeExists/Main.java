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

        public boolean isIdentical(Node node, Node subRoot){
            if(node==null && subRoot==null){
                return true;
            }else if(node==null||subRoot==null||node.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(node.left, subRoot.left)) return false;
            if(!isIdentical(node.right, subRoot.right)) return false;
            return true;
        }
        public boolean isSubtree(Node root, Node subRoot){
            if(root == null) return false;
            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
        }
    }
    public static void main(String[] args) {
        int[] nodes1 = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1 , -1 };
        int[] nodes2 = {2, 4, -1, -1, 5, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes1);
        Node subRoot = tree.buildTree(nodes2);
        System.out.println(tree.isSubtree(root, subRoot));
    }
}