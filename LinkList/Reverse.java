import java.util.LinkedList;

public class Reverse {
    public static void name(LinkedList<Integer> ll) {
        for (int i = ll.size() - 1; 0 <= i; i--) {
            System.out.print(ll.get(i) + "->");
        }
    }
    public static void main(String[] args) {
         LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.offer(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);

        name(ll);
    }
}
