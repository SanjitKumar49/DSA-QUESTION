public class DigonalSum {
    public static void main(String[] args) {
        int num[][]={ {1,2,3,4,5},
                      {6,7,8,9,0},
                      {7,6,5,4,3},
                      {8,4,3,2,5},
                      {1,2,4,5,7}
                 };
   int sum=0;
   /* for(int i=0; i<num.length; i++)
   {
    for(int j=0; j<num[i].length; j++){
        if(i==j){
            sum=sum+num[i][j];
        }
        else if(i+j==num.length-1)
        {
            sum=sum+num[i][j];
        }
        }
    }
    System.out.println(sum);
    */
    for(int i=0; i<num.length; i++)
   {
    sum+=num[i][num.length-1-i];
    if(i!=num.length-1-i)
    {
        sum+=num[i][num.length-i-1];
    }
}
System.out.println(sum);
    }   
}

