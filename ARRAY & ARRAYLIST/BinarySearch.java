
public class BinarySearch {
    public static void Search(int number[], int eliment) {
        int start = 0;
        int end = number.length - 1;
        int count = 0;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (number[mid] == eliment) {
                System.out.println(mid);
                break;
            } else if (number[mid] < eliment) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int num[] = { 4, 5, 6, 7,8,9,10 };
        int target = 10;
        Search(num, target);

    }

}
