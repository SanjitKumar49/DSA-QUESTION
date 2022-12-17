public class Meximum {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 55, 6, 7 };
        int lareg = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > lareg) {
                lareg = num[i];
            }
        }
        int small=Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++)
        {
            if(small>num[i])
            {
small=num[i];
            }
        }
        System.out.println("small number in a array "+small);
        System.out.println("large number in a array "+lareg);
    }

}
