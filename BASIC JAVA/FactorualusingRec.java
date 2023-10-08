class FactorualusingRec{
public static int fact(int n){
if(n==1){
return 1;
}
int value=fact(n-1);
int finalvalue=value*n;
    return finalvalue;
}
public static void main(String args[]){
System.out.print(fact(3));‪
}
}