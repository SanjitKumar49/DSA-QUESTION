import java.util.Scanner;
class TribleFeb{
  public static void main(String [] args){
    int num1=0,num2=1,num3=2;
  System.out.print("Enter the number:-");
    Scanner sc=new Scanner(System.in);
     int endnum=sc.nextInt();
    for(int i=0; i<=endnum; i++){
    System.out.println(num1);
      int temp=num1+num2+num3;
      num1=num2; 
    num2=num3;
   num3=temp;
}
System.out.println();
}
}

/*    ->OUTPUT<-
Enter the number:-10
0
1
2
3
6
11
20
37
68
125
230
simller to fibebonacce series also 
use only two num
*/  

 