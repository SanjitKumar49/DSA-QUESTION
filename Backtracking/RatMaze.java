public class RatMaze {
    public static int sourceDestenetin(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else{
            if(i==n || j==m){
            return 0;
            }
            }
        //recurstion fn
       // int up=sourceDestenetin(i, j-1, n, m);
        int down=sourceDestenetin(i, j+1, n, m);
        int right=sourceDestenetin(i+1, j, n, m);
       // int left=sourceDestenetin(i-1, j, n, m);
        return down+right;
    }
    public static void main(String[] args) {
        int n=2;
        int m=2;
         System.out.println( sourceDestenetin(0, 0, n, m)); 
    }
}
