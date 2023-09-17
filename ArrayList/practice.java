import java.util.Stack;

public class practice {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && num > stack.peek()) {
                stack.pop();
            }
            stack.push(num);
        }

        return stack.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,9};
        practice solution = new practice();
        int minLength = solution.minOperations(nums);
        System.out.println("Minimum Length of nums: " + minLength);
    }

}