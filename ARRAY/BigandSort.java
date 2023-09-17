public class BigandSort {
    public static void bigandSort(int arr[]) {
        int n = arr.length;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 54, 6, 78 };
        bigandSort(arr);

    }
}
