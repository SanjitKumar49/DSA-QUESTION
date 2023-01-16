import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingString {
    // booble sort
    public static void method(String str[]) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                if (str[j].compareTo(str[j+1])>0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                    count++;
                }
               
            }
              System.out.print(str[i] + " ");
              
            }
        if (count == 0){
        System.out.print("data elready sorted");
        }
        System.out.println("ittretion: "+count);
      }

    public static void main(String[] args) {
        //int arr[] = { 111,2,3,4,5,6,7,8,9 };
         String str[]={"n","s","a","v"};
        // Arrays.sort(str);
        // System.out.print(Arrays.toString(str));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // for(int i=0; i<arr.length; i++){
        // System.out.print(arr[i]+" ");
        // }
        method(str);

    }
}
