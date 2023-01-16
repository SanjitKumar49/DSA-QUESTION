public class LastOccurence {
    public static int fun(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int found = fun(arr, key, i + 1);

        if ((arr[i] == key && found == -1)) {
            return i;

        }
        return found;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4 };
        int key = 19;
        System.out.println(fun(arr, key,0));

        // System.out.println(key, key,0));

    }
}