package DSA2_practice.linkedlist;

class Node{
    Node next;
    Node prev;
    int val;
    Node(int data){
        this.val = data;
        this.next = null;
        this.prev = null;
    }
}

class doublyLinkedList {
    Node head;
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
    public void pushFront(int k){
        Node newNode = new Node(k);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void pushEnd(int k){
        Node newNode = new Node(k);
        if (isEmpty()){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }
    public int peekTop(){
        return head.val;
    }
    public void popBack(){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }
    public void popTop(){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        head = head.next;
        head.prev = null;
    }
    public int peekBottom(){
        if(isEmpty()){
            System.out.println("Empty List");
            return 0;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            return temp.val;
        }
    }
    public void findElement(int k){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        if(head.val == k){
            System.out.println("Found");
            return;
        }
        else{
            Node temp = head;
            while(temp.next != null && temp.val != k){
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
        }
        if(head.val == k){
            newNode.next = head.next;
            head.next.prev = newNode;
            head.next = newNode;
            newNode.prev = head;
        }
        else {
            Node temp = head;
            while (temp.next != null && temp.val != k){
                temp = temp.next;
            }
            if(temp.val == k){
                if(temp.next == null){
                    newNode.prev = temp;
                    temp.next = newNode;
                    return;
                }
                newNode.next = temp.next;
                temp.next.prev = newNode;
                newNode.prev = temp;
                temp.next = newNode;
            }
            else {
                System.out.println("Element Not Found");
            }
        }
    }
    public void deleteElement(int k){
        if(isEmpty()){
            System.out.println("Empty List");
        }
        if(head.val == k){
            head = head.next;
            head.prev = null;
        }
        else{
            Node temp = head;
            while(temp.next != null && temp.val != k){
                temp = temp.next;
            }
            if(temp.val == k){
                if(temp.next == null){
                    temp.prev.next = null;
                    return;
                }
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            else {
                System.out.println("Element not Found");
            }
        }
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void reverDLL(){
        Node tempNext = null;
        Node tempPrev = null;
        Node temp = head;
        while(temp != null){
            tempNext = temp.next;
            temp.next = tempPrev;
            temp.prev = tempNext;
            tempPrev = temp;
            temp = tempNext;
        }
        head = tempPrev;
    }

    public static void main(String[] args) {
        doublyLinkedList dLL = new doublyLinkedList();
        dLL.pushFront(4);
        dLL.pushFront(3);
        dLL.pushFront(2);
        dLL.pushFront(1);
        dLL.pushEnd(5);
        dLL.pushEnd(6);
        dLL.pushEnd(7);
        dLL.pushEnd(8);
        dLL.addElement(5, 5);
        dLL.printList();
        dLL.deleteElement(5);
        dLL.findElement(2);
        dLL.reverDLL();
        dLL.printList();
        dLL.reverDLL();
        dLL.printList();
    }
}
