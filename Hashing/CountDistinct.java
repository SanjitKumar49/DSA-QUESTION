import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : num) {
            set.add(integer);

        }
        System.out.println(set);
    }
}
