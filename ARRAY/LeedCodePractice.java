public class LeedCodePractice {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }

    public static void reverse(int x) {
        int n;
        while(x>0){
        n=x%10;
        System.out.print(n);
        x=x/10;
        }
}

    public static void main(String[] args) {
       // int arr[] = { 1, 3, 5, 9 };
        reverse(123);
    }
}
