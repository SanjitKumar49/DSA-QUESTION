public class ConvertString {
    static String str[]={"zer","one","two","three","four","five","sixe","seven","eight","nine"};
    
    public static void fun(int n){
        
        if(n==0){
          return;
        }
        int lastnumber=n%10;
        fun(n/10);
       System.out.println(str[lastnumber]+" ");
    }
    public static void main(String[] args) {
        fun(1254);
        
    }
}
