package DSA3_practice.tree;

import java.io.InputStreamReader;
import java.util.Scanner;

public class checkBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node tree[] = new Node[n];
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            tree[i] = new Node(value);
        }
        int root = sc.nextInt();
        for(int i = 0; i < n; i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(left != 0){
                tree[i].left = tree[left - 1];
            }
            if(right != 0){
                tree[i].right = tree[right - 1];
            }
        }
        if(isBST(tree[root - 1], Integer.MIN_VALUE, Integer.MAX_VALUE)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean isBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }
        return isBST(root.left, min, root.data - 1) && isBST(root.right, root.data + 1, max);
    }
}
