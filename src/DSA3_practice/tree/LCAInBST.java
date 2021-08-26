package DSA3_practice.tree;

public class LCAInBST {
    public Node LCA(Node root, int v1, int v2){
        if(root == null){
            return null;
        }
        if(root.data < v1 && root.data < v2){
            return LCA(root.right, v1, v2);
        }
        if(root.data > v1 && root.data > v2){
            return LCA(root.left, v1, v2);
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
