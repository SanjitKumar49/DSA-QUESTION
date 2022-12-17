import javax.management.AttributeChangeNotification;

public class linearSearch {
    public static void main(String[] args) {
        int num[]={1};
        int target=0;
        int count=0;
        for(int i=0; i<num.length; i++)
        {
            if(num[i]==target)
            {
                System.out.println(i);
                count++;
            }
        }

if(count==0)
{
    System.out.println("-1");
}
    }
    
}
