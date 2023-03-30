import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);
        int length = list.size();
        System.out.println(length);
        System.out.println(list);
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ",");
        }

    }

}
