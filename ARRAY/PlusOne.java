public class PlusOne{
    public static void method(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        method(arr);
    }
}