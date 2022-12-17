import java.util.Arrays;
import java.util.Scanner;

public class UpdateArr {

    public static void Updatemethod(int number1[]) {
        for (int i = 0; i < number1.length; i++) {
            number1[i] = number1[i] + 1;

        }
        
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7};
        Updatemethod(num);

        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
          
        }
       

    }

}
