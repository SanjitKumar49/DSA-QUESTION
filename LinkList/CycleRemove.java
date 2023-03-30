public class CycleRemove {
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

        public static boolean cycle(){
             Node slow=head;
             Node fast=head;
             while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
             }
             return false;
        }
        public static void removeCycle(){
            Node slow=head;
            Node fast=head;
            boolean data=false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    data=true;
                    break;

                }
            }
            if(data==false){
                return;
            }
            slow=head;
            Node priveus=null;
            while(slow!=fast){
                priveus=fast;
                slow=slow.next;
                fast=fast.next;
            }
            priveus.next=null;
        }
    

    public static void main(String[] args) {
      //  CycleRemove obj = new CycleRemove();
       head=new Node(2);
       head.next=new Node(4);
       head.next.next=new Node(6);
       head.next.next.next=new Node(8);
       System.out.println(cycle());
       removeCycle();
       System.out.println(cycle());
    }

}
