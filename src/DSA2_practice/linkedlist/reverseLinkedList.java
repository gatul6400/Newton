package DSA2_practice.linkedlist;

public class reverseLinkedList {
    public Node reverseLinkList(Node head){
        if(head == null){
            return head;
        }
        else{
            Node tempNext = null;
            Node tempPrev = null;
            Node temp = head;
            while (temp != null){
                tempNext = temp.next;
                temp.next = tempPrev;
                tempPrev = temp;
                temp = tempNext;
            }
            return tempPrev;
        }
    }
}
