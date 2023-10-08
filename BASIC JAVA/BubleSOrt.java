import java.Arrays.*;
class BubleSOrt{
public static void main(String args[]){
int arr[]={24,3,65,43,76,2,1};
int count=0;
sort(arr);
}
public static void sort(int arr[]){
int n=arr.length;
for(int i=0; i<n; i++){
 for(int j=0; j<n-1; j++){
   if(arr[j]<arr[j+1]){
      int temp=arr[j+1];
       arr[j+1]=arr[j];
       arr[j]=temp;
        count++;
    }
  }
}
if(count!=0){
   System.out.print("Array alredy sorted");
 }else{
   System.out.print(Arrays.toString(Arr));
}
}


}