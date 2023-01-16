import java.util.Arrays;

public class SelcetionSort {
    public static void method(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[start])<0) {
                    start = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arrr[] = { 1, 3, 2, 4, 6, 4, 2, 7, 7 };
        String str[]={"sanjit","nikesh","akash","neeraj","vikash"};
        method(str);
    }
}
