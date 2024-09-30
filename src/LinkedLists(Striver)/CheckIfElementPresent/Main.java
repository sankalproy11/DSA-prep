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
        public Node arr2LL(int[] data){
            Node head = new Node(data[0]);
            Node mover = head;
            for (int i = 1; i < data.length; i++) {
                Node temp = new Node(data[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }
        public boolean isPresent(Node head, int element){
            Node temp = head;
            while(temp != null){
                if(temp.data == element) return true;
                temp = temp.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] data = {23, 52, 63, 62, 62, 23, 673, 999, 23, 27};
        int element = 999;
        LinkedList list = new LinkedList();
        Node head = list.arr2LL(data);
        System.out.println(list.isPresent(head, element));
    }

}