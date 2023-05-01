import java.util.Stack;

public class ClosetElement {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left=null;
            right=null;
        }
    }

    // Two sum BST.
    public static Node root1, root2;

    public static int countPair(Node root1, Node root2, int x) {
        if (root1 == null || root2 == null) {
            return 0;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        Node top1, top2;
        int count = 0;
        while (true) {
            while (root1 != null) {
                st1.push(root1);
                root1 = root1.left;
            }
            while (root2 != null) {
                st2.push(root2);
                root2 = root2.right;
            }
            if (st1.empty() || st2.empty())
                break;
            top1 = st1.peek();
            top2 = st2.peek();
            if ((top1.data + top2.data) == x) {
                count++;
                st1.pop();
                st2.pop();
                root1 = top1.right;
                root2 = top2.left;
            } else if ((top1.data + top2.data) < x) {
                st1.pop();
                root1 = top1.right;
            } else {
                st2.pop();
                root2 = top2.left;
            }
        }
        return count;
    }

    //Maximum sum of subTree
    public static Node maxSub(Node root){
        if(root==null){
            return root;
        }
        
        Node leftSub=maxSub(root.left);
        Node rightSub=maxSub(root.right);
        return leftSub+rightSub;
    }

    public static Node closeElement(Node rNode, int key) {

        if (rNode == null) {
            return rNode;
        }

        Node leftNode = closeElement(rNode.left, key);
        Node rightnNode = closeElement(rNode.right, key);
        return leftNode;

    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(7);
        root.right.left=new Node(6);
        root.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right = new Node(15);
        root2.right.left=new Node(11);
        root2.right.right = new Node(18);
       int x=16;
       System.out.println(countPair(root, root2, x));

        

    }
}
