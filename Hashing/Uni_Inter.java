import java.util.HashSet;

public class Uni_Inter {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set1 = new HashSet<>();
        // HashSet<Integer> set2=new HashSet<>();
        /// Union //
        for (Integer integer : arr1) {
            set1.add(integer);
        }
        for (Integer integer2 : arr2) {
            set1.add(integer2);
        }

        System.out.println("size is: " + set1.size() + "|" + set1);

        /// Intersection ///

        set1.clear();
        for (Integer integer : arr1) {
            set1.add(integer);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                count++;
                set1.remove(arr2[i]);
            }

        }
        System.out.println();
        System.out.println("size is: " + count);
    }

}