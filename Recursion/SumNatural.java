public class SumNatural {
    public  static int fun(int n){
    if(n==1){
   return n;
    }
    int recall =fun(n-1);
    int sum=n+recall;
    return sum;
}


    public static void main(String[] args) {
      System.out.println(fun(5));  
        
    }
    
}
