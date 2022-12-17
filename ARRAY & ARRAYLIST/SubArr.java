public class SubArr {
  

    public static void pair(int number[]) {
        for (int i = 0; i < number.length; i++)
            
        {
            int first = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("(" + first + "," + j + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        pair(num);

    }
}