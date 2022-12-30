import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int temp,j;
        int num[]={2,43,55,7,8,7,54};
        for(int i=1; i<num.length; i++)
        {
             temp=num[i];
             j=i;
            while(j>0 && num[j-1]>temp)
            {
                num[j]=num[j-1];
                j=j-1;

            }
            num[j]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
