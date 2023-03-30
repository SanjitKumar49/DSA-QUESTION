import java.util.LinkedList;
import java.util.Queue;

class BinaryProgram {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binar {
        static int indx = -1;

        public Node buildtree(int nodes[]) {
            indx++;

            if (nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

        // preOrder //
        public static void preOder(Node root) {
            if (root == null) {
                // System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data + " ");
            preOder(root.left);
            preOder(root.right);
        }

        // inOrder //
        public static void inOder(Node root) {
            if (root == null) {
                // System.out.print("-1"+" ");
                return;
            }
            preOder(root.left);
            System.out.print(root.data + " ");
            preOder(root.right);
        }

        // postOrder //
        public static void postOder(Node root) {
            if (root == null) {
                // System.out.print("-1"+" ");
                return;
            }
            preOder(root.left);
            preOder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currnode = q.remove();
                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currnode.data + " ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binar obj = new Binar();
        Node root = obj.buildtree(nodes);
        obj.preOder(root);
        System.out.println();
        obj.inOder(root);
        System.out.println();
        obj.postOder(root);
        System.out.println();
        obj.levelOrder(root);

    }
}