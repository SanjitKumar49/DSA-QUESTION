public class ZigZag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void zigZag(){
        Node slwo=head;
        Node fast=head.next;
        while(slwo!=null && fast!=null){
            slwo=slwo.next;
            fast=fast.next.next;
        }
        Node mid=slwo;

        Node curr=mid.next;
       mid.next=null;
       Node prev=null;
       Node next;
       while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       Node left=head;
       Node right=prev;
       Node nextl,nextr;
       while(left!=null && right!=null){
        nextl=left.next;
        left.next=right;
        nextr=right.next;
        right.next=nextl;
        left=nextl;
        right=nextr;
       }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void First(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public static void main(String[] args) {
        ZigZag obj=new ZigZag();
        obj.First(1);
        obj.First(2);
        obj.First(3);
       
        obj.print();

        obj.First(4);
        obj.print();

        
    }
}
