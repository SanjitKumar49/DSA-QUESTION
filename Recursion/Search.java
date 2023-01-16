public class Search {
    public static int fun(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==key){
           System.out.println(i);
            // return i;
        }
    
       int recallfn=fun(arr, key, i+1);
         return i;
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,8,7,8};
        int key=8;
        System.out.println(fun(arr, key, 0));
    }
}
