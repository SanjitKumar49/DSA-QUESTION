import java.util.Comparator;
import java.util.PriorityQueue;

public class Simple {
    // static class Student implements Comparable<Student> {
    //     String name;
    //     int rank;

    //     public Student(String name, int rank) {
    //         this.name = name;
    //         this.rank = rank;
    //     }

    //   @Override
    //   public int compareTo(Student s2){
    //     return this.rank-s2.rank;
    //   }
    // }
    public static void main(String[] args) {
       // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(100);
        pq2.add(200);
        pq2.add(300);
       while(!pq2.isEmpty())
       {
        System.out.println(pq2.peek()+" ");
        pq2.remove();
       }
        // pq.add(new Student("A", 10));
        // pq.add(new Student("B", 20));
        // pq.add(new Student("C", 30));
        // while(!pq.isEmpty()){
         
        //     System.out.println(pq.peek().rank+"->"+pq.peek().name);
        //    pq.remove();
        // }

    }
}