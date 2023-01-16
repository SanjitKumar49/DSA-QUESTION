import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,6,8,6,5,4,2};
        for(int i=1; i<arr.length; i++){
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
