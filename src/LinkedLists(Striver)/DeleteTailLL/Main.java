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
        public Node arrToList(int[] arr){
            Node head = new Node(arr[0]);
            Node mover = head;
            
            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }

            return head;
        }

        public Node deleteTail(Node head){
            if(head == null || head.next == null) return null;
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }

        public void traverse(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {35, 24};
        LinkedList list = new LinkedList();
        Node head = list.arrToList(arr);
        System.out.println("Original list: ");
        list.traverse(head);
        System.out.println("\nList after deletion: ");
        Node newHead = list.deleteTail(head);
        list.traverse(newHead);
    }
}