public class Sum3 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        //int newArray[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                int temp=nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
                count++;
            }
    }
        return count;
    }

 public static void main(String args[]) {
        int num[] = { 0,0,1,1,1,2,2,3,3,4 };
        System.out.println(removeDuplicates(num));

    }
}