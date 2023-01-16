public class AllOcernce {
     public static int fun(int arr[],int key, int i){
        if(i==arr.length){
            return-1;
        }
        if(arr[i]==key){
        System.out.print(i+" ");
        }
       return fun(arr, key, i+1);
     }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        fun(arr, 2, 0);
        
    }
}
