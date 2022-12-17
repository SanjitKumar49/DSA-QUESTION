
public class Linear {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
         int search=15;
         int temp=0;
         for(int i=1; i<array.length; i++)   
         {
            if(array[i]==search)
            {
                System.out.println("eliment: "+search +"here in index: "+i);
                temp=temp+1;
            }
          
         }
         if(temp==0)
         System.out.println("be cant find");

    }
    
}
