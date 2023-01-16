public class TrapWater {
    public static void whatTrap(int water[]) {
        int n = water.length;

        /*
         * // left maximum boundary
         * int leftmax[] = new int[n];
         * leftmax[0] = water[0];
         * for (int i = 0; i < n; i++) {
         * leftmax[i] = Math.max(water[i], leftmax[i-1]);
         * }
         * 
         * // right maximum boundary
         * int rightmax[] = new int[n];
         * rightmax[n - 1] = water[n - 1];
         * for (int i = n - 2; i >= 0; i--) {
         * rightmax[i] = Math.max(water[i], rightmax[n+1]);
         * 
         * }
         * int trappedwater = 0;
         * for (int i = 0; i < n; i++) {
         * int waterlebal = Math.min(leftmax[i], rightmax[i]);
         * trappedwater = waterlebal - water[i];
         * }
         * System.out.println(trappedwater);
         * }
         */
        int res = 0, left = 0, right = n - 1;
        int leftmax = water[left], rightmax = water[right];
        while (left < right) {
            if (leftmax < rightmax) {
                left++;
                leftmax = Math.max(leftmax, water[left]);
                res += leftmax - water[left];
            } else {
                right--;
                rightmax = Math.max(rightmax, water[right]);
                res += rightmax - water[right];

            }
        }
System.out.println(res);
    }

    public static void main(String[] args) {
        int num[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        whatTrap(num);
    }

}
