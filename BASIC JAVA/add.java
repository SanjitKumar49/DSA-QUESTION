import java.util.Scanner;
public class add{
   public static void main(String[] args){
      int input_1, input_2, my_sum;
      Scanner my_scanner = new Scanner(System.in);
      input_1 = my_scanner.nextInt();
      input_2 = my_scanner.nextInt();
      my_scanner.close();
      my_sum = input_1 + input_2;
      System.out.println(my_sum);
   }
}