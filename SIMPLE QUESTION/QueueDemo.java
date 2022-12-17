import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.offer(93);
        q.offer(98);
        q.offer(78);
        q.offer(80);
        System.out.println(q);

    }
    
}
