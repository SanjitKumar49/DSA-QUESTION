import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class BasicHas {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sanjit", 549);
        hm.put("Nikesh", 533);
        hm.put("Vikash", 559);
        hm.put("Aditya", 501);
        hm.put("Suraj", 552);
        System.out.println(hm);

        /*
         * System.out.println("size is: " + hm.size());
         * System.out.println("empty: " + hm.isEmpty());
         * System.out.println(hm.containsKey("sanjit"));
         * System.out.println(hm.containsKey("sanjitkumar"));
         * System.out.println(hm.remove("Aditya"));
         * // hm.clear();
         * for (String key : hm.keySet()) {
         * System.out.println("key is a: " + hm.get(key) + " ");
         * }
         * System.out.print(hm.keySet());
         */

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("sanjit", 549);
        lhm.put("Nikesh", 533);
        lhm.put("Vikash", 559);
        lhm.put("Aditya", 501);
        lhm.put("Suraj", 552);
        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("sanjit", 549);
        tm.put("Nikesh", 533);
        tm.put("Vikash", 559);
        tm.put("Aditya", 501);
        tm.put("Suraj", 552);
        tm.remove("Aditya");
        System.out.println(tm);
        // int arr[]={1,2,3,4,5,6,7,8};
        // HashMap<Integer,Integer> h=new HashMap<>();
        // System.out.println(h.containsKey(3));
    }
}