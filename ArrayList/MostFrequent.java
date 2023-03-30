import java.util.ArrayList;

public class MostFrequent {
    public static void method(ArrayList<Integer> al,int key){
        int arr[]=new int[100];
        for(int i=0; i<al.size(); i++){
            if(key==al.get(i)){
                arr[al.get(i+1)-1]++;
             }
        }
         int max=Integer.MIN_VALUE;
         int count=0;
         for(int i=0; i<arr.length; i++){             
             if(max<arr[i]){
                max=arr[i];
                count++;
             }
         }
     System.out.println(count);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(3);
        method(al, 2);
       
    }
}
