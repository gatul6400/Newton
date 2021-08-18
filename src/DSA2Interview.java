import java.security.PublicKey;

class Node{
    Node next;
    int val;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}
class DSA2Interview {
    Node head;
    public void push(int k){
        Node newNode = new Node(k);
        if(head == null){
            newNode.next = head;
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" -> ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        DSA2Interview ll = new DSA2Interview();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(10);
        ll.printList();
    }
}
