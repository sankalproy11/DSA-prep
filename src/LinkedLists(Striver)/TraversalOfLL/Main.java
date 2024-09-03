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

        public void traverse(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 242, 52, 53, 645, 12};
        LinkedList list = new LinkedList();
        Node head = list.arrToLL(arr);
        list.traverse(head);
    }
}