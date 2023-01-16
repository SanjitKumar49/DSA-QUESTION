public class Counting {
    public static void main(String[] args) {
        int num=121897832,count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);

    }
}
