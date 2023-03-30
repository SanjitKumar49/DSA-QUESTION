import java.lang.reflect.Method;

public class First {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int llsize;

    public void First(int data) {
        Node newNode = new Node(data);
        llsize++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        llsize++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addsome(int idx, int data) {
        if (idx == 0) {
            First(data);
            return;
        }
        Node newNode = new Node(data);
        llsize++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removefirst() {
        if (llsize == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (llsize == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        llsize--;
        head = head.next;
        return val;
    }

    public int removelast() {
        if (llsize == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (llsize == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        // prev=i=llsize-2
        Node prev = head;
        for (int i = 0; i < llsize - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        llsize--;
        return val;
    }
    public int Search(int key){
     Node temp=head;
     int i=0;
     while(temp!=null){
        if(temp.data==key)
        {
            return i;
        }
        temp=temp.next;
        i++;
     }
     return -1;
  
    }
    
// reverse question 
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;                                                       
        }
        head=prev;
        
    }
    public static void main(String[] args) {
        First ll = new First();
        // ll.print();
         ll.First(1);
        // ll.print();
         ll.First(2);
        // ll.print();
        ll.addLast(3);
        // ll.print();
         ll.addLast(4);
        // ll.print();
        ll.addsome(4, 5);
        // ll.print();
        // System.out.println(ll.llsize);
        // ll.removefirst();
        // ll.print();
        // ll.removelast();
        // ll.print();
        //head=new Node(2);
        ll.reverse();
        ll.print();
    }
}