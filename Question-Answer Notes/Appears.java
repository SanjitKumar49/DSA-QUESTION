class Appears {

    public static void method(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    System.out.println("true");
                    count++;
                }

            }
        }
        if (count == 0)

            System.out.println("false");
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
        method(nums);

    }
}