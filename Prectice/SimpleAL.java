
import java.util.ArrayList;
import java.util.List;

class SimpleAl {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            al.add(i);
        }
        System.out.println(al);
        System.out.println(al.get(5));

        System.out.println(al.remove(5));
        int max = Integer.MIN_VALUE; // This is for maximum number.
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < al.size(); j++) {
            // if(min>al.get(j)){
            // min=al.get(j);
            // }
            max = Math.max(max, al.get(j));
        }
        System.out.println(max);
        ArrayList<ArrayList<Integer>> newarr = new ArrayList<>();
        SimpleAl obj = new SimpleAl();
        obj.doubleArrayList(newarr);

    }

    // add two arraylist in one list.
    public void doubleArrayList(ArrayList<ArrayList<Integer>> arr) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            first.add(i * 1);
            first.add(i * 2);

        }
        arr.add(first);
        arr.add(second);
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> current = arr.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j) + ",");
            }
            System.out.println();

        }
        System.out.println(arr);
    }
}