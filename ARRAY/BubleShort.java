import java.util.Arrays;

public class BubleShort {
    public static void main(String[] args) {
        int flag=0;
        int nums[]={1,90,76,2,34,21,10};
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-i-1; j++){
                
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
            }
           
        }

        if(flag==0)
        System.out.println("all");
        System.out.println(Arrays.toString(nums));
    }
}
