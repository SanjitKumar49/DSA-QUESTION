
// Count of smaller number after self //
class Count_smaller_number {
    public static void smallerNumber(int nums[], int temp[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1 || nums[i] == nums[nums.length - 1]) {
                temp[i] = 0;
            }

            else if (nums[i] > nums[i + 1]) {
                temp[i] = nums[i + 1];
            } else {
                if (nums[i] > nums[i + 2]) {
                    temp[i] = nums[i + 2];
                }
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 2, 6, 1 };
        int temp[] = new int[nums.length];
        smallerNumber(nums, temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");

        }
    }
}