public class Tilling {
    public static int fun(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical=fun(n-1);
        int horizental=fun(n-2);
        int sum=vertical+horizental;
        return sum;
        
    }
    public static void main(String[] args) {
      System.out.println(  fun(5));
        
    }
}
