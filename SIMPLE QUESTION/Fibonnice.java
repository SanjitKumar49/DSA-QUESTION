public class Fibonnice {
          public static void fibb(int n) {
        int a=0; int b=1;
        int counter=0;
        while(counter<n){
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;
            counter++;
        }

    }
    public static void main(String[] args) {
        fibb(8);
    }
}
