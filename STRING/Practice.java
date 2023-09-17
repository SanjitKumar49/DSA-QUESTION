public class Practice {

      
public static void main(String[] args) {
      String str="2";
   String str2="     9888";
    //Solution obj=new Solution();
   // System.out.println(  obj.addStrings(str, str2));
   System.out.println( data(str2)); 

   
   
//reverseString(str);
    
}
 public static int data(String s){
      int nus=Integer.parseInt(s);
      return nus;

    }

  public static void reverseString(char[] s) {
        int n=s.length;
        for(int i=0; i<n/2; i++){
              char temp=s[i];
               s[i]=s[n-1-i];
               s[n-1-i]=temp;
              // System.out.print(s[i]+",");
        }
         for(int i=0; i<n; i++){
            System.out.print(s[i]+",");   
         }     
    }
}
 class Solution {
      public String addStrings(String num1, String num2) {
       int first=Integer.parseInt(num1);  
      int second=Integer.parseInt(num2);  
      int sum=first+second;
      String finalAns=Integer.toString(sum);
      return finalAns;      
           
      }
  }
