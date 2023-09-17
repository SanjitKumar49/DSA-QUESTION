import java.util.Arrays;

class practiceArray{
public static void main(String args[]){
int arr[]={98,23,1,43,4,0,54,21,1};
sort(arr);
selectionSort(arr);
insertionSort(arr);
}
private static void insertionSort(int[] arr) {
    
}
private static void selectionSort(int[] arr) {
    int n=arr.length;
    for(int i=0; i<n; i++){
        int indx=i;
        for(int j=i+1; j<n; j++){
            if(arr[indx]>arr[j])
                  indx=j;
        }
        int temp=arr[i];
        arr[i]=arr[indx];
        arr[indx]=temp;
    }
    System.out.print(Arrays.toString(arr));
}

public static void sort(int arr[]){
    int count=0;
int n=arr.length;
for(int i=0; i<n; i++){
 for(int j=0; j<n-1; j++){
   if(arr[j]>arr[j+1]){
      int temp=arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp;
        count++;
    }
  }
}
if(count==0){
   System.out.print("Array alredy sorted");
 }
 
 else{
   System.out.print(Arrays.toString(arr));
}
}


}