public class SubArrSum {
    public static void SumArray(int num[]){
        int ln=Integer.MIN_VALUE,sum=0;

        for(int i=0; i<num.length; i++){
            int first=i;
            for(int j=1; j<num.length; j++){
                int second=j;
                for(int k=first; k<second; k++)
                {
                 sum+=num[k];
                }
               System.out.println(sum);
               if(ln<sum){
                ln=sum;
               }

            }
        }
        System.out.println(ln);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        SumArray(num);
    }
}
