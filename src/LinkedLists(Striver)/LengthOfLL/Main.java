public class Main{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        public Node arr2LL(int[] arr){
            Node head = new Node(arr[0]);
            Node mover = head;
            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }

        public int lenOfLL(Node head){
            Node temp = head;
            int count = 0;
            while(temp != null){
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 24, 53, 23, 53, 23, 63, 82, 42};
        LinkedList list = new LinkedList();
        Node head = list.arr2LL(arr);
        System.out.println("Length of linked list is: "+list.lenOfLL(head));
    }
}