package DSA2_practice.linkedlist;

public class mergeTwoLL {
    public Node mergeTwoLinkedList(Node head1, Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        else{
            Node result = null;
            Node temp = null;
            while (head1 != null && head2 != null){
                if(head1.val < head2.val){
                    if(result == null){
                        temp = head1;
                        result = temp;
                    }
                    else{
                        temp.next = head1;
                        temp = temp.next;
                    }
                    head1 = head1.next;
                }
                else{
                    if(result == null){
                        temp = head2;
                        result = temp;
                    }
                    else{
                        temp.next = head2;
                        temp = temp.next;
                    }
                    head2 = head2.next;
                }
            }
            if(head1 == null){
                temp.next = head2;
            }
            if(head2 == null){
                temp.next = head1;
            }
            return result;
        }
    }
}
