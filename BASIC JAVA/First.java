
import java.util.ArrayList;
 class first{
public static void main(String args[]){

   ArrayList<Integer> arr= new ArrayList<>();
         
       arr.add(2);
        arr.add(4);
arr.add(5);
arr.add(6);
arr.add(8);
arr.add(10);
 for(int i=0; i<arr.size(); i++){
        if(arr.get(i)%2==0){
        System.out.println(arr.get(i));
}
}
}
}