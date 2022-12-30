public class DemoTrapWater {
    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        int sum=0;
        int start=0, end=num.length-1;
        int leftMax=num[start],rightmax=num[end];
        while(start<end)
        {
            if(leftMax<rightmax)
            {
                start++;
                 leftMax=Math.max(leftMax,num[start]);
                sum+=leftMax-num[start];

            }
            else
            {
                end--;
                rightmax=Math.max(rightmax,num[end]);
                sum+=rightmax-num[end];

            }
        }
        System.out.println(sum);
    }
    
}
