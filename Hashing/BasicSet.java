import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(400);
        set.add(100);
        set.add(200);
        set.add(300);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(800);
        set1.add(1000);
        set1.add(2000);
        set1.add(3000);


        // // Iteration Method //
       
        // Iterator iy=set.iterator();
        // while(iy.hasNext()){
        //     System.out.println(iy.next());
        // }
     for (Integer integer : set1) {
            System.out.println(integer);
            
        }
     /*   System.out.println(set.size());
        System.out.println(set.addAll(set1));
        System.out.println(set.remove(400));
     System.out.println(set.contains(100));
        System.out.println(set.isEmpty());*/
        System.out.println(set);
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Avit");
        lhs.add("VMRF");
        lhs.add("Nit");
        lhs.add("iit");
        System.out.println(lhs);
    }
}
