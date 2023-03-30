import java.util.Stack;

public class Span {
    public static void stackSpan(int stack[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stack.length; i++) {
            int curr = stack[i];
            while (!s.empty() && curr > stack[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prehigh = s.peek();
                span[i] = i - prehigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stack[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stack.length];
        stackSpan(stack, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + ",");
        }

    }
}
