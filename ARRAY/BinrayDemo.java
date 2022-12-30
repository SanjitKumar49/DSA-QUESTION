public class BinrayDemo {
    public static void Search(int data[], int trg) {
        int st = 0;
        int en = data.length - 1;
        int mid = st + en / 2;
     
        while (st <= en) {
          
          
            if (data[mid] == trg) {
                System.out.println("data found: " + mid);
                break;
            } else if (data[mid] >= trg) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
            mid = st + en / 2;
        
         }
            System.out.println("data  not found: ");

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 0;
        Search(num, target);

    }
}