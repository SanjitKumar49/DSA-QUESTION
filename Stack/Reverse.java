import java.util.Stack;

public class Reverse {
    public static String stringReverse(String str) {
        Stack<Character> st = new Stack<>();
        int indx = 0;
        while (indx < str.length()) {
            st.push(str.charAt(indx));
            indx++;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (!st.empty()) {
             char curr = st.pop();
            stringBuilder.append(curr);

        }
        return stringBuilder.toString();
        //System.out.println(stringBuilder);

    }

    public static void main(String[] args) {
        String str2 = "abc";
        String result = stringReverse(str2);
        System.out.println(result);

    }
}
