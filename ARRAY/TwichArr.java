public class TwichArr {
    public static void Main(int number[]){
    int n = number.length;
    int count = 0;
    {
       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[i] == number[j])
                {
                System.out.println("true");
                count = count + j;
                }

            }
        }
        if(count==0)
        System.out.println("false");
        
    }
}

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5,9,8};
        Main(num);

    }
}
