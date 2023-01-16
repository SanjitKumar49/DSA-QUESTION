class Roteted {
    public static void method(int nums[], int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == target) {
                if (nums[i] == 0 || nums[i] == 1) {
                    System.out.println(-1);
                } else {
                    System.out.println(nums[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        method(nums, target);
    }
}