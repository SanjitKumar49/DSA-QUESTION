import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        int start=0,last=nums.length-1;
        while(start<last)
        {
            int temp=nums[last];
            nums[last]=nums[start];
            nums[start]=temp;
            last--;
            start++;

        }
        System.out.println(Arrays.toString(nums));
        
    }

}
