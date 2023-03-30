import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Qestion {
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

    public static boolean isSubtree(Node root, Node subtree) {
        if (root == null) {
            return false;
        }
        if (root.data == subtree.data) {
            if (isIdentical(root, subtree)) {
                return true;
            }
        }
        return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);
    }

    public static boolean isIdentical(Node node, Node subtree) {
        if (node == null && subtree == null) {
            return true;
        } else if (node == null || subtree == null || node.data != subtree.data) {
            return false;
        }
        if (!isIdentical(node.left, subtree.left)) {
            return false;
        }
        if (!isIdentical(node.right, subtree.right)) {
            return false;
        }
        return true;
    }

    // ----------- Top View Question ------------//
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    // ----------- K level of Question ------------ //
    public static void kLvel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data);
            return;
        }
        kLvel(root.left, level + 1, k);
        kLvel(root.right, level + 1, k);
    }

    // ----------- Lowest Comman Ancestor of Question ----------- //

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean fundleft = getpath(root.left, n, path);
        boolean fundright = getpath(root.right, n, path);
        if (fundleft || fundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        // last comman oncestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
    }
    // ----------- Lowest Comman Ancestor second Approach ----------- //

    public static Node lac2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = lac2(root.left, n1, n2);
        Node rightlca = lac2(root.right, n1, n2);
        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }
        return root;
    }

    // ----------- Min distance between nodes ----------- //

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }
    }
      public static int minDiat(Node root, int n1, int n2) {
        Node lca = lac2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    // ----------- Kth Ancestor of nodes ----------- //
    public static int kAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=kAncestor(root.left, n, k);
        int rightDist=kAncestor(root.right, n, k);
        if(leftDist ==-1 && rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.print(root.data);
        }
        return max+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // subroot
        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right=new Node(5);
        // System.out.println(isSubtree(root, subroot));
        // topView(root);
        // int k=3;
        // kLvel(root, 1,k);
        int n1 = 5, k = 2;
        kAncestor(root, n1, k);
       // System.out.print();

    }
}
