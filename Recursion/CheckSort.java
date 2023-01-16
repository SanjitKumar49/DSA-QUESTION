public class CheckSort {
    public static boolean fun(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return fun(arr, i + 1);
    }

    public static void main(String[] args) {
        int array[] = { 1, 10, 9, 4, 5 };
        int i = 0;
        System.out.print(fun(array, 0));

    }
}
