public class Swap {
    public static void main(String[] args) {
        int num=10; 
        int num2=20;
        num=num+num2;
        num2=num-num2;
        num=num-num2;
        System.out.println(num +" "+num2);
    }
}
