class new {
     public static void reverse(int x) {
        int n;
        while(x>0){
        n=x%10;
        System.out.print(n);
        x=x/10;
        }
}
public static void main(String args[]){
    reverse(109);
}
}