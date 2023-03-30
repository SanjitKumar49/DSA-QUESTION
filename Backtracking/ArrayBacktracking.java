import java.util.Arrays;

class ArrayBacktracking {
    public static void method(int arr[], int i, int val) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            // printArr(arr);
            return;
        }
        arr[i] = val;
        method(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }
    // public static void printArr(int arr[]){
    // for(int i=0; i<arr.length; i++){
    // System.out.print(arr[i]+"");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        int arr[] = new int[10];
        method(arr, 0, 1);
        // printArr(arr);
        System.out.println(Arrays.toString(arr));

    }
}