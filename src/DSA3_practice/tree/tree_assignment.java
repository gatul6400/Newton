package DSA3_practice.tree;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class tree_assignment {
    public Node insertionInBST(Node root, int k){
        if(root == null){
            return new Node(k);
        }
        if(root.data < k){
            root.right = insertionInBST(root.right, k);
        }
        else if(root.data > k){
            root.left = insertionInBST(root.left, k);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int L[] = new int[n + 1];
        int R[] = new int[n + 1];
        int P[] = new int[n + 1];

        for(int i = 1; i <= n; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();

            if(L[i] != -1){
                P[L[i]] = i;
            }
            if(R[i] != -1){
                P[R[i]] = i;
            }
        }
        while(q-- > 0){
            int temp = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            while(temp != -1){
                if(L[P[temp]] == temp){
                    list.add(0, 1);
                }
                else{
                    list.add(0, 0);
                }
                temp = P[temp];
            }
            for(Integer i : list){
                if(i.equals(0)) {
                    if (L[temp] != -1){
                        temp = L[temp];
                        break;
                    }
                    temp = L[temp];
                }
                else{
                    if (R[temp] != -1){
                        temp = R[temp];
                        break;
                    }
                    temp = R[temp];
                }
            }
            System.out.println(temp);
        }
    }
}
