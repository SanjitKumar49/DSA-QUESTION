import java.util.*;
public class Intinerary {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revops=new HashMap<>();
        for (String key : tickets.keySet()) {
            revops.put(tickets.get(key),key);
        }
        for (String key : tickets.keySet()) {
           if(!revops.containsKey(key))
               return key;
             }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai", "Bengulure");
        tickets.put("Mumbai", "delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        
        String start=getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet())
        {
         
           System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
