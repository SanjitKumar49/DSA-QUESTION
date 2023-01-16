class Reverse {
    public static void main(String args[]) {
       /*  int num = 7, count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("yes its prim number:");
        else
            System.out.println("no it is not a prime number:");
           
            int num1=5,num2=99;
            for(int i=num1; i<=num1; i++){
                for(int j=2; j<=i; j++){
                    if(i%j==0)
                    {
                        break;
                    }
                    if(i==j)
                    System.out.println(j+",");
                   
                }
            }
             */
            int num1=0,num2=1,temp,num=10;
            for(int i=0; i<=num; i++){
                System.out.print(num1+",");
                temp=num1+num2;
                num1=num2;
                num2=temp;
            }
          

    }
}