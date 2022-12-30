public class countSet {
    public static void main(String[] args) {
        int n=2,count=0;
        
        while(n>0)
        {
            if((n&1)!=0)
            {
             count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    
}
