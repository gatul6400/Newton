package DSA3_practice.tree;

class treesOperation {
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
    public Node insertionInBSTItertive(Node root, int k){
        Node newNode = new Node(k);
        if(root == null){
            root = newNode;
            return root;
        }
        else{
            Node temp = root;
            while (temp != null){
                if(temp.data < k){
                    temp = temp.right;
                }
                else if(temp.data > k){
                    temp = temp.left;
                }
            }
            temp = newNode;
        }
        return root;
    }
    public Node deletioninBST(Node root, int k){
        if(root == null){
            return null;
        }
        if(root.data < k){
            root.right = deletioninBST(root.right, k);
        }
        else if(root.data > k){
            root.left = deletioninBST(root.left, k);
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
                Node minElementRight = minVal(root.right);
                root.data = minElementRight.data;
                root.right = deletioninBST(root.right, root.data);
            }
        }
        return root;
    }
    public Node minVal(Node root){
        if(root == null){
            return null;
        }
        if(root.left == null){
            return root;
        }
        return minVal(root.left);
    }
    public int getTreeHeight(Node root){
        if(root == null){
            return 0;
        }
        int left = getTreeHeight(root.left);
        int right = getTreeHeight(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        treesOperation BST = new treesOperation();
        Node root = new Node(10);
//        BST.insertionInBSTItertive(root,2);
        BST.insertionInBST(root, 1);
        BST.insertionInBST(root, 15);
        BST.insertionInBST(root, 5);
        BST.insertionInBST(root, 2);
        BST.insertionInBST(root, 35);
        BST.insertionInBST(root, 25);
//        BST.deletioninBST(root, 10);
        trees.inOrder(root);
        System.out.println(BST.getTreeHeight(root));
    }
}
