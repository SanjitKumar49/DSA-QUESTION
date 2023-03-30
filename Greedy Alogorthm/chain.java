import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class chain {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 0;
        ArrayList<Integer> list = new ArrayList<>();
        chainlen = 1;
        list.add(pairs[0][0]);
        int chainend = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainend) {
                chainlen++;
                chainend = pairs[i][1];
                list.add(pairs[i][0]);
            }
        }
        System.out.println(chainlen);
        // for (Integer integer : list) {
        // System.out.print(list.get(integer) + " ");
        // }

        for (int i = 0; i < list.size(); i++) {
            System.out.print("{" + list.get(i) + "}" + " ");
        }
        System.out.println();

    }
}
