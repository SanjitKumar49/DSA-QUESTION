import java.util.*;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "tulip";
        String t = "lipid";
        System.out.println(isAnagram(s, t));
    }

}
