public class BasicOpertion {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Hight Opertion
    public static int hightMesu(Node root) {
        if (root == null) {
            return 0;
        }
        int left = hightMesu(root.left);
        int rigth = hightMesu(root.right);

        return Math.max(left, rigth) + 1;
    }

    // count of Nodes
    public static int nodeCount(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = nodeCount(root.left);
        int rightCount = nodeCount(root.right);
        return leftCount + rightCount + 1;
    }

    // sum of nodes
    public static int sumNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumNode(root.left);
        int rightSUm = sumNode(root.right);
        return leftSum + rightSUm + root.data;
    }

    // Diametere of tree
    // 1 Approach to find diameter
    public static int diaMeter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdia = diaMeter(root.left);
        int leftht = hightMesu(root.left);
        int rightdia = diaMeter(root.right);
        int rightht = hightMesu(root.right);

        int rootdia = leftht + rightht + 1;

        return Math.max(rootdia, Math.max(rightdia, leftdia));
    }
    // 2 Approach to find diameter

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diaMeter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info lefftInfo = diaMeter2(root.left);
        Info righInfo = diaMeter2(root.right);
        int diam = Math.max(Math.max(lefftInfo.diam, righInfo.diam), lefftInfo.ht + righInfo.ht+1);
        int ht = Math.max(lefftInfo.ht, righInfo.ht) + 1;
        return new Info(diam, ht);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println("Root height is:" + hightMesu(root));
        System.out.println("Root count is:" + nodeCount(root));
        System.out.println("Root sum is:" + sumNode(root));
        System.out.println("Root Diameter is:" + diaMeter(root));
        System.out.println("Root Diameter2 is:" + diaMeter2(root).ht);

    }
}
