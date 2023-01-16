public class StringSort {
    public static void printString(String arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void divide(String arr[], int si, int ei) {
        int mid = si + ei / 2;
        divide(arr, si, mid);// left side
        divide(arr, mid + 1, ei);
        marge(arr, si, mid, ei);
    }

    public static void marge(String arr[], int mid, int si, int ei) {
        String newstr[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] != arr[j]) {
                newstr[k] = arr[i];
                i++;
                k++;
            } else {
                newstr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            newstr[k++] = arr[i++];
        }
        while (j <= ei) {
            newstr[k++] = arr[j++];
        }
        for (k = 0, i = si; k < newstr.length; k++, i++) {
            arr[i] = newstr[k];

        }
    }

    public static void main(String[] args) {
        String str[] = { "sun", "earth", "mars", "mercury" };
        printString(str);
        divide(args, 0, str.length-1);

    }

}
