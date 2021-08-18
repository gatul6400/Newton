package DSA2_practice.linkedlist;

public class checkPalimdrome {
    public void palimdrome(Node head){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        else{
            Node temp = head;
            int size = 0;
            while(temp.next != null){
                temp = temp.next;
                size++;
            }
            temp = head;
            int mid = size/2;
            while (mid-- > 0){
                int i = size;
                Node temp2 = head;
                while(i-- > 0){
                    temp2 = temp2.next;
                }
                if(temp.val != temp2.val){
                    System.out.println("List is not a palimdrome");
                    return;
                }
                temp = temp.next;
                size--;
            }
            System.out.println("List is palimdrome");
            return;
        }

    }
}
