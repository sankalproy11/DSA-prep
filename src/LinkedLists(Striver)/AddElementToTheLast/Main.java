public class Main{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{

        public Node arrToLL(int[] arr){
            Node head = new Node(arr[0]);
            Node mover = head;
            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }

        public Node append(Node head, int x){
            Node newNode = new Node(x);
            if(head == null) return newNode;

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            return head;
        }

        public void Traversal(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 41, 78, 64, 98, 65, 1, 96};
        LinkedList list = new LinkedList();
        Node head = list.arrToLL(arr);
        list.append(head, 69);
        list.Traversal(head);

    }
}