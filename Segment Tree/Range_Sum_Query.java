public class Range_Sum_Query {
    public static void query(int nums[], int temp[], int n) {
        temp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            temp[i] = nums[i] + temp[i - 1];
        }
    }

    public static int querySum(int left, int right, int temp[]) {
        if (left == 0)
            return temp[right];

        return temp[right] - temp[left - 1];
    }

    public static void main(String[] args) {
        int nums[] = { -2, 0, 3, -5, 2, -1 };
        int n = nums.length;
        int temp[] = new int[n];
        query(nums, temp, n);
        System.out.println(querySum(0, 2, temp));
    }
}
