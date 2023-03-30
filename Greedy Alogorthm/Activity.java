import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity {
    public static void main(String[] args) {
        //sorted
        // int start[] = { 1, 3, 0, 5, 8, 5 };
        // int end[] = { 2, 4, 6, 7, 9, 9 }; 
        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };
        int doublearr[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            doublearr[i][0] = i;
            doublearr[i][1] = start[i];
            doublearr[i][2] = end[i];
        }
        Arrays.sort(doublearr, Comparator.comparingDouble(o -> o[2]));

        int maxact = 0;
        ArrayList<Integer> ansindx = new ArrayList<>();
        maxact = 1;
        ansindx.add(doublearr[0][0]);
        int lastend = doublearr[0][2];
        for (int i = 1; i < end.length; i++) {
            if (doublearr[i][1] >= lastend) {
                maxact++;
                ansindx.add(doublearr[i][0]);
                lastend = doublearr[i][2];
            }
        }
        System.out.println("maximum activity is :" + maxact);
        for (int i = 0; i < ansindx.size(); i++) {
            System.out.print("A" + ansindx.get(i) + " ");
        }
        System.out.println();
    }
}