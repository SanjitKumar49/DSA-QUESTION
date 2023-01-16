public class Meximum {
    public static void main(String[] args) {
        int num[] = {3,5,4,1,9 };
       int small = Integer.MAX_VALUE;
       int lareg = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > lareg) {
                lareg = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (small > num[i]) {
                small = num[i];
            }
        }
        System.out.println("small number in a array " + small);
        System.out.println("large number in a array " + lareg);
    }

}
