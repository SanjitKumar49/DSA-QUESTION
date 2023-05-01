import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrecticeSet {
    static PriorityQueue<Integer> min;
    static int k;

    static List<Integer> getAllKthNumber(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (min.size() < k) {
                min.add(val);
            } else {
                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }
            if (min.size() >= 0)
                list.add(min.peek());
            else
                list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        min = new PriorityQueue<>();
        k = 3;
        int arr[] = { 10, 20, 11, 70, 50, 40, 100, 5 };
        List<Integer> res = getAllKthNumber(arr);
        for (int x : res)
            System.out.println(x + " ");
    }
}
