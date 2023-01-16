public class Incr {
    public void fun(int n){
        if(n==1){
            System.out.println(n);
            return;

        }
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Incr obj=new Incr();
        obj.fun(5);
        
    }
}
