import java.util.ArrayList;
import java.util.LinkedList;

public class ImplimentHash {
    static class HashMap<k, v> {
        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("Unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lamda = (double) n / N;
            if (lamda > 2.0) {
                rehash();
            }
        }

        public boolean containKey(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public v remove(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<k> keySet() {
            ArrayList key = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    key.add(node.key);
                }
            }
            return key;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hms = new HashMap<>();
        hms.put("india", 1000);
        hms.put("China", 100);
        hms.put("US", 500);
        hms.put("Indinouse", 700);

        ArrayList<String> keys = hms.keySet();
        for (String key : keys) {
            System.out.println(key);

        }

    }
}
