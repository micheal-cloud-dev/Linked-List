class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public class InsertAtEndCode{
        public static Node insertAtEnd(Node head,int data){
           Node newNode = new Node(data);

           if(head == null){
              return newNode;
           }
           Node temp = head;
           while(temp.next != null){
            temp = temp.next;
           }

           temp.next = newNode;
           return head;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
    public static void main(String[] args){

        Node head = null;

        head = insertAtEnd(head,10);
        head = insertAtEnd(head,20);
        head = insertAtEnd(head,30);
        head = insertAtEnd(head,40);

        display(head);
    }
}
