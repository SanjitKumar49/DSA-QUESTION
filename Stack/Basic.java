import java.util.*;

public class Basic {

    // using arraylist 

    // static class Stacks {
    // static ArrayList<Integer> list = new ArrayList<>();

    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // public static void push(int data) {
    // list.add(data);
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return list.get(list.size() - 1);
    // }

    // }
    // using LinkedList //

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head ==null;
        }

        public static void pm(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop() {
            if (isEmpty()) {

                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> obj=new Stack<>();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.pop();
       
        System.out.println(obj);
        System.out.println( obj.peek());
        
        // stack obj = new stack();
        // obj.pm(2);
        // obj.pm(4);
        // obj.pm(6);
        // obj.pm(8);
        // while (!obj.isEmpty()) {
        //     System.out.print(obj.peek()+"^");
        //     obj.pop();
            

        // }

    }
}