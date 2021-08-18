package com.practice;

class Node{
    int val;
    Node next;
    Node(int d){
        val = d;
        next = null;
    }
}
class linkedListAssignment {
    Node head;
//    This function will print the Linked List
//    This function didn't take any value in parameter
    void printList(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

//    This function will add new node as a head node
//    This function will take a value k as in parameter
//    And that value will be added at the first position
    void pushFront(int k){
        Node newNode = new Node(k);
        newNode.next = head;
        head = newNode;
    }


//    This function will return the value of head node
//    This function didn't take any value in parameter
    int topFront(){
        return head.val;
    }

//    This function will delete the head node
//    This function didn't take any value in parameter
    void popFront(){
        head = head.next;
    }


//    This function will add new node at the last position
//    This function will take a value k as in parameter
//    And that value will be added at the end
    void pushBack(int k){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(k);
        temp.next = newNode;
    }


//    This function will return the value of last node
//    This function didn't take any value in parameter
    int topBack(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.val;
    }

//    This function will delete the last node
//    This function didn't take any value in parameter
    void popBack(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

//    This function will check the key is lie on the linked list or not
//    This function will take a value k as in parameter
//    This function will return 'true' if found else 'false'
    void find(int k){
        Node temp = head;
        boolean check = false;
        while(temp != null){
            if(temp.val == k){
                check = true;
                break;
            }
            temp = temp.next;
        }
        System.out.println(check);
    }

//    This function will check the list is empty or not
//    if it emptry then return 'true' else 'false'
//    This function didn't take any value in parameter
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        else {
            return false;
        }
    }


//    This function will take a value k as in parameter
//    This function will check the key is lie on the linked list or not
//    This function will delete the node
//    If found then delete else show shows a massage that key not found
//    This function also check the list is empty or not?
    void eraseKey(int k){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            int pos = 1;
            while(temp.next != null){
                if(temp.next.val == k){
                    break;
                }
                temp = temp.next;
                pos++;
            }
            if(pos == 1){
                temp.next = temp.next.next;
            }

            else if(head.val == k){
                head = head.next;
            }
            else if(temp.next != null){

                temp.next = temp.next.next;
            }
            else{
                System.out.println("Key is not found !!!");
            }
        }
    }


//    This function will take a two value k and data as in parameter
//    This function will check the key(k) is lie on the linked list or not
//    This function will add a new node whose value(data) just before key(k)
//    If found then add new node else show shows a massage that key not found
//    This function also check the list is empty or not?
    void addBeforeElement(int k, int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }
        else{
            Node temp = head;
            int pos = 1;

            while (temp.next != null){
//                System.out.println(temp.val+" -> "+ pos);
                if(temp.next.val == k){
                    break;
                }
                temp = temp.next;
                pos++;
            }
//            System.out.println(temp.val+"  didnwif");
            if(pos == 1){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            else if(head.val == k){
                newNode.next = head;
                head = newNode;
            }
            else if(temp.next != null){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            else{
                System.out.println("Key not found Node is not added to list...");
            }

        }
    }

//    This function will take a two value k and data as in parameter
//    This function will check the key(k) is lie on the linked list or not
//    This function will add a new node whose value(data) just after key(k)
//    If found then add new node else show shows a massage that key not found
//    This function also check the list is empty or not?
    void addAfterElement(int k, int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            int pos = 1, last = 1;
            while(temp.next!= null){
                if(temp.next.val == k){
                    break;
                }
                temp = temp.next;
                pos++;
                last++;
            }
            if(pos == 1){
                newNode.next = temp.next.next;
                temp.next.next = newNode;
            }
            else if (head.val == k){
                newNode.next = head.next;
                head.next = newNode;
            }
            else if (temp.next != null){
                newNode.next = temp.next.next;
                temp.next.next = newNode;
            }
            else if (temp.next == null){
                if(temp.val == k){
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                else{
                    System.out.println("Key not fount Node is not added to list");
                }
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        linkedListAssignment LL = new linkedListAssignment();
//        LL.head = new Node(1);
//        Node n1 = new Node(10);
//        Node n2 = new Node(100);
//        Node n3 = new Node(1000);
//        Node n4 = new Node(10000);
//        LL.head.next = n1;
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
        LL.printList();
        System.out.println(LL.isEmpty());
        LL.pushFront(1);
        LL.pushFront(10);
        LL.pushFront(50);
        LL.pushFront(100);
//        LL.printList();
//        System.out.println(LL.topBack());
//        System.out.println(LL.topFront());
        LL.pushFront(1000);
//        System.out.println(LL.isEmpty());
//        LL.printList();
        LL.pushBack(999);
//        System.out.println(LL.topFront());
//        LL.printList();
        LL.popBack();
//        LL.printList();
        LL.popFront();
//        LL.printList();
//        LL.find(500);
//        LL.eraseKey(15);
//        LL.addBeforeElement(1, 30);
        LL.addAfterElement(15, 5000);
        LL.popFront();
        LL.printList();
    }
}
