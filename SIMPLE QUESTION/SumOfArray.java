public class SumOfArray {
    
        public  static int[] twoSum(int[] nums, int target) {
            int currsum=0;
            for(int i=0; i<nums.length; i++){
                int start=i;
                  for(int j=i; j<nums.length; j++){
                      int end=j;
                       currsum=0;
                         for(int k=start; k<end; k++)
                         {
                         System.out.println(nums[k]+" ");
                             currsum=currsum+nums[k];
                         }
                    if(target==currsum)
                    {
                        System.out.print(currsum);
                    }
                       System.out.println();
        }
                   
                }
                
        }
    
    public static void  main(String[] args) {
        int[] nums={2,7,11,15};
        SumOfArray.twoSum(nums,9);
    }
}
    
    
    

