package DSA2_practice.linkedlist;
//class Node{
//    Node next;
//    int val;
//    Node(int data){
//        this.val = data;
//        this.next = null;
//    }
//}
class linkList {
    Node head;
    public linkList(){

    }
    public linkList(int data){
        Node newNode = new Node(data);
        head = newNode;
    }
    public void printList(){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void pustFront(int k){
        Node newNode = new Node(k);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void pushEnd(int k){
        Node newNode = new Node(k);
        if(isEmpty()){
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
    public int peekTop(){
        return head.val;
    }
    public void popFront(){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        head = head.next;
    }
    public void popBack(){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        else {
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public int peekBottom(){
        Node temp = head;
        while (head.next != null){
            temp = temp.next;
        }
        return temp.val;
    }
    public void findElement(int k){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        if(head.val == k){
            System.out.println("Found");
        }
        else{
            Node temp = head;
            while (temp.next != null && temp.val != k){
                temp = temp.next;
            }
            if(temp.val == k){
                System.out.println("Found");
                return;
            }
            System.out.println("Not Found");
        }
    }
    public void addElement(int k, int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        if(head.val == k){
            newNode.next = head.next;
            head.next = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null && temp.val != k){
                temp = temp.next;
            }
            if(temp.val == k){
                if(temp.next == null){
                    temp.next = newNode;
                    return;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
            else{
                System.out.println("Element Not Found");
            }
        }
    }
    public void deleteElement(int data){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        if(head.val == data){
            head = head.next;
            return;
        }
        else{
            Node temp = head;
            while (temp.next != null && temp.next.val != data){
                temp = temp.next;
            }
            if(temp.next.val == data){
                if(temp.next.next == null){
                    temp.next = null;
                    return;
                }
                temp.next = temp.next.next;
            }
            else {
                System.out.println("Element Not Found");
            }
        }
    }
    public void reverseLL(){
        Node tempNext = null;
        Node temp = head;
        Node tempPrev = null;
        while (temp != null){
            tempNext = temp.next;
            temp.next = tempPrev;
            tempPrev = temp;
            temp = tempNext;
        }
        head = tempPrev;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void printNode(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkList ll = new linkList();
//        linkList head = new linkList(10);
        ll.pustFront(4);
//        System.out.println(ll.head.val);
        ll.pustFront(3);
        ll.pustFront(2);
        ll.pustFront(1);
        ll.pushEnd(5);
        ll.pushEnd(60);
        ll.pushEnd(7);
        ll.pushEnd(80);
        ll.addElement(4,5);
//        ll.printList();
        ll.findElement(1);
        ll.deleteElement(5);
//        ll.reverseLL();
        ll.printList();
//        ll.reverseLL();
        ll.printList();
        linkList ll2 = new linkList();
        ll2.pushEnd(25);
        ll2.pushEnd(10);
        ll2.pushEnd(20);
        ll2.pushEnd(51);
        ll2.pushEnd(15);
        ll2.printList();
        mergeTwoLL merge = new mergeTwoLL();
        Node demo = merge.mergeTwoLinkedList(ll.head, ll2.head);
        System.out.println("Merged List");
        ll.printNode(demo);
//        reverseLinkedList reverse = new reverseLinkedList();
//        Node reversedList = reverse.reverseLinkList(demo);
//        ll.printNode(reversedList);
        checkPalimdrome palimdrome = new checkPalimdrome();
//        palimdrome.palimdrome(ll.head);
        linkList ll3 = new linkList();
        ll3.pustFront(1);
        ll3.pustFront(2);
        ll3.pustFront(3);
        ll3.pustFront(2);
        ll3.pustFront(1);
        ll3.printList();

        palimdrome.palimdrome(ll3.head);
    }
}
