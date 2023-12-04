import java.util.Scanner;

// A binary tree node
class Node {

    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinaryTree {

    static Node root;

    /* A function that constructs Balanced Binary Search
     Tree from a sorted array */
    Node sortedArrayToBST(int[] arr, int start, int end)
    {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        /* Recursively construct the left subtree and make
         it left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);

        /* Recursively construct the right subtree and make
         it right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    /* A utility function to print preorder traversal of BST
     */
    void preOrder(Node node)
    {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }

        root = tree.sortedArrayToBST(arr, 0, n - 1);
        tree.preOrder(root);
    }
}