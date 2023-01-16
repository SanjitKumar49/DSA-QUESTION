import java.util.Arrays;

public class BoobleSort{
    public static void sorting(String arr[]){
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j].compareTo(arr[j+1])>0){
                    String str=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=str;
                }
            }
        }
    }
    public static void main(String[] args) {
        String str[]={"avit","svnit","vmrf","iit","iiit","gecs","ckp"};
        sorting(str);
        System.out.println(Arrays.toString(str));
        
        }
}