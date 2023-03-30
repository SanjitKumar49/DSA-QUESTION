import java.util.LinkedList;

public class Search {
    public static void fun(LinkedList<Integer> ll, int key) {

        int count = 0;
        for (int i = 0; i < ll.size(); i++) {
            if (i == key) {
                System.out.println(ll.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("-1");
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
        ll.remove(2);
        System.out.println(ll);

    }
}
