package DSA2_practice.linkedlist;

public class queueLinkedList {
    Node head;
    Node tail;
    public void enqueue(int k){
        Node newNode = new Node(k);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        else{
            head = head.next;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        else{
            System.out.println(head.val);
        }
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        queueLinkedList queue = new queueLinkedList();
        queue.peek();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.peek();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.peek();
    }
}
