import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityEml {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
            // if (hash.containsKey(arr[i])) {
            // hash.put(arr[i], hash.get(arr[i]) + 1);
            // } else
            // hash.put(arr[i], 1);
        }

        // Set<Integer> keySet = hash.keySet();
        for (Integer key : hash.keySet()) {
            if (hash.get(key) > arr.length / 3) {
                System.out.println(key);
            }

        }
    }
}
