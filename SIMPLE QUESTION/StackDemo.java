import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        stack.push(600);

        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(stack.search(500));
        System.out.println(stack.peek());
    }
    
}
