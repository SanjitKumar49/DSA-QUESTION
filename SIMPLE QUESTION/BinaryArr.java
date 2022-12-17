
public class BinaryArr {
    public static void MAin(int num[], int t) {
        int start =0;
        int last = num.length - 1;
        int mid = (start + last) / 2;
        {
            while (start <= last) {
               
               
                if (num[mid] == t)
                {
                   System.out.println(mid);
                   break;
                }
                else if (num[mid]<t)
                {
                 start = mid+1;
                    }
                else{
                    last = mid-1;
                }
             mid = (start + last) / 2;
           }
       
        
        
            

        }
       
            }

    public static void main(String[] args) {
        int Arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        MAin(Arr, target);

    }
}
