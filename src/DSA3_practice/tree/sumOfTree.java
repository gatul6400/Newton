package DSA3_practice.tree;

import java.util.Scanner;

public class sumOfTree {
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
    public void intsertionInBst(int k){
        Node newNode = new Node(k);
        if(root == null){
            root = newNode;
            return;
        }
        insert(root, k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumOfTree sum = new sumOfTree();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            sum.intsertionInBst(temp);
        }
        System.out.println(checkBST.isBST(sum.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(sum.sumOfNodes(sum.root));
    }
    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        int sum = left + right + root.data;
        return sum;
    }
}
