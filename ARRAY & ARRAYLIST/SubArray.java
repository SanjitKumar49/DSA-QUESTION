public class SubArray {

  public static void main(String[] args) {
    int num[] = { 1, -2, 6, -1, 3 };
    int currentSum = 0;
    int sum = Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {

      currentSum = currentSum + num[i];
      if (currentSum < 0) {
        currentSum = 0;
      }
      sum = Math.max(sum, currentSum);
    }
    System.out.println(sum);

  }
}
