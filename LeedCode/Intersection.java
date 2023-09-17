import java.util.Arrays;

class Intersection{
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int nums2[]={4,3};
        int newArr[]=new int[nums.length];
         for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums2.length; j++){
                if( nums[i]==nums2[j]){
                 newArr[i]=nums[i];
                }
            }
         }
         System.out.println(Arrays.toString(newArr));
    }
}