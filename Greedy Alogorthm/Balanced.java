public class Balanced {
    static int blancepartion(String str, int n) {
        if (n == 0) {
            return 0;
        }
        int r = 0, l = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }
            if (r == l) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.print(blancepartion(str, n));

    }
}
