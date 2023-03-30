public class Anagram {
    public static void method(String s[], String t[]) {
        int count = 0;
        for (char i = 0; i < s.length; i++) {
            for (char j = 0; j < t.length; j++) {
                if (s.charAt(i)==t.charAt[j]) {
                    System.out.println("true");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        String s[] = { "anagram" };
        String t[] = { "nagaram" };
        method(s, t);
    }
}
