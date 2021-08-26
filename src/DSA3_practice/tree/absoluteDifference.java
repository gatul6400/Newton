package DSA3_practice.tree;

import java.util.Scanner;

public class absoluteDifference {
    Node root;
    public Node insert(Node root, int k){
        if(root == null){
            return new Node(k);
        }
        if(root.data < k){
            root.right = insert(root.right, k);
        }
        if(root.data > k){
            root.left = insert(root.left, k);
        }
        return root;
    }
    public void insertion(int k){
        Node newNode = new Node(k);
        if(root == null){
            root = newNode;
            return;
        }
        insert(root, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        absoluteDifference abs = new absoluteDifference();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            abs.insertion(temp);
        }
        System.out.println(abs.absMinDiff(abs.root));
    }
    static Integer prev = null, mindiff = Integer.MAX_VALUE;
    public int absMinDiff(Node root){
//        prev = null;
//        mindiff = Integer.MAX_VALUE;
        BST(root);
        return mindiff;
    }
    public void BST(Node root){
        if(root == null){
            return;
        }
        BST(root.left);
        if (prev != null){
            mindiff = Math.min(root.data - prev, mindiff);
        }
        prev = root.data;
        BST(root.right);
    }
}
