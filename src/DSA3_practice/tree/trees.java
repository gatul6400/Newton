package DSA3_practice.tree;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
//          TREE LOOK LIKE
//                1
//        2               3
//    4       5       6       7
public class trees {
    public static void main(String[] args) {

        Node root = new Node(1);

        Node chR1 = new Node(2);
        Node chR2 = new Node(3);
        root.left = chR1;
        root.right = chR2;

        Node ch11 = new Node(4);
        Node ch12 = new Node(5);
        chR1.left = ch11;
        chR1.right = ch12;

        Node ch21 = new Node(6);
        Node ch22 = new Node(7);
        chR2.left = ch21;
        chR2.right = ch22;
        System.out.println("Pre-Order");
        preOrder(root);
        System.out.println("\nIn-Order");
        inOrder(root);
        System.out.println("\nPost-Order");
        postOrder(root);
    }
    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

}
