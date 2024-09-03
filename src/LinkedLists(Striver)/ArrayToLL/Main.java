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
    }
    public static void main(String[] args) {
        int arr[] = {32, 52, 1, 5, 7, 45};
        LinkedList list = new LinkedList();
        Node head = list.arrToLL(arr);
        System.out.println(head.data);
     }
}