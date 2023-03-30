import java.util.ArrayList;
import java.util.Collections;
 
//Simple approach //
public class Monotonic {
    // public static boolean doublectData(ArrayList<Integer> al){
    //   for(int i=0; i<al.size(); i++){
    //     for(int j=i+1; j<al.size(); j++){
    //         if(al.get(i)==al.get(j)){
    //           return true;
    //         }
    //     }
    //     }
    //   return false;
    // }
    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<A.size()-1; i++) {
        if (A.get(i) > A.get(i+1))
        inc = false;
        if (A.get(i) < A.get(i+1))
        dec = false;
        }
        return inc || dec;
        }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(1);

        al.add(5);
        al.add(6);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
       
        
       System.out.println(isMonotonic(al));
        
    }
}
