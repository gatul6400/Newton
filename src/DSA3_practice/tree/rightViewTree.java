package DSA3_practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class rightViewTree {
    public void rightView(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            for(int i = 1; i <= n; i++){
                Node node = queue.poll();
                if(i == n){
                    System.out.print(node.data+" ");
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
    }
    public static Node insertionInBST(Node root, int k){
        if(root == null){
            return new Node(k);
        }
        if(root.data < k){
            root.right = insertionInBST(root.right, k);
        }
        if(root.data > k){
            root.left = insertionInBST(root.left, k);
        }
        return root;
    }
    public Node deleteInBST(Node root, int k){
        if(root == null){
            return  null;
        }
        if(root.data < k){
            root.right = deleteInBST(root.right, k);
        }
        else if(root.data > k){
            root.left = deleteInBST(root.left, k);
        }
        else{
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.left != null && root.right == null){
                root = root.left;
            }
            else if(root.right != null && root.left == null){
                root = root.right;
            }
            else{
                Node replacement = MinimumVal(root.right);
                root.data = replacement.data;
                root.right = deleteInBST(root.right, root.data);
            }
        }
        return root;
    }
    public Node MinimumVal(Node root){
        if(root == null){
            return null;
        }
        if(root.left == null){
            return root;
        }
        return MinimumVal(root.left);
    }

    public static void main(String[] args) {
        rightViewTree tree = new rightViewTree();
        Node root = new Node(10);
        tree.insertionInBST(root, 5);
        tree.insertionInBST(root, 2);
        tree.insertionInBST(root, 15);
        tree.insertionInBST(root, 50);
        tree.insertionInBST(root, 25);
//        tree.deleteInBST(root, 10);
        trees.levelOrder(root);
        System.out.println();
        trees.inOrder(root);
        System.out.println();
        tree.rightView(root);
        System.out.println();
        System.out.println(checkBST.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(tree.countSubtreeWithSumX(root,7));
    }
    static int c = 0;
    public int countSubtreeWithSumX(Node root, int x){
//        c = 0;
        if(root == null){
            return 0;
        }
        int left = countSubtreeWithSumXUtil(root.left, x);
        int right = countSubtreeWithSumXUtil(root.right, x);
        if((left + right + root.data) == x){
            c++;
        }
        return c;
    }
    public int countSubtreeWithSumXUtil(Node root, int x){
        if(root == null){
            return 0;
        }
        int left = countSubtreeWithSumXUtil(root.left, x);
        int right = countSubtreeWithSumXUtil(root.right, x);
        int sum = left + right + root.data;
        if(sum == x){
            c++;
        }
        return sum;
    }
}
