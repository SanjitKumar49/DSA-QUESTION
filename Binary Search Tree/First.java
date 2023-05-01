import java.util.ArrayList;

public class First {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Q1-Build BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // inOrder
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Q2- Searching In BST
    public static boolean searchNode(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchNode(root.left, key);
        } else {
            return searchNode(root.right, key);
        }
    }

    // Q3- Delete a Node
    public static Node deleteNode(Node root, int val) {
        if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            Node Is = findInOredrSuccessor(root.right);
            root.data = Is.data;
            root.right = deleteNode(root.right, Is.data);
        }
        return root;
    }

    public static Node findInOredrSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Q4- Root to leaf paths:
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    // Mirror Node
    public static Node mirrorNode(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = mirrorNode(root.left);
        Node rightMirror = mirrorNode(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // preoder for mirror quetion
    public static void preOder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOder(root.left);
        preOder(root.right);
    }

    public static void main(String[] args) {
        // inbuild
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        // inOrder(root);
        printRoot2Leaf(root, new ArrayList<>());
        /*
         * System.out.println();
         * root=deleteNode(root, 7); // for deleting node
         * System.out.println();
         * inOrder(root);
         */

        /*
         * if(searchNode(root, 30)){
         * System.out.println("valid"); // for Searching
         * }
         * else{
         * System.out.println("invalid");
         * }
         */

        /*
         * Node root = new Node(8);
         * root.left = new Node(5);
         * root.right = new Node(10);
         * root.left.left = new Node(3); // for mirror Question
         * root.left.right = new Node(6);
         * root.right.right = new Node(11);
         * root = mirrorNode(root);
         * preOder(root);
         */

    }
}