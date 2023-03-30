import java.util.*;
  //Tc=0(n) && Sc==0(n)
public class Lonely {
    public static void findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
        System.out.println(list);
    }

    // public static void lonelyNumber(ArrayList<Integer> al) {
    // for (int i = 0; i < al.size(); i++) { //10,6,5,8
    // int newel = al.get(i) - 1;
    // int preel = al.get(i) + 1;
    // for (int j = 0; j < al.size(); j++) {
    // if (newel == al.get(j) || preel==al.get(j)) {
    // System.out.println("");
    // }else{
    // System.out.println(al.get(j));
    // }
    // }
    // }
    // }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(6);
        al.add(5);
        al.add(8);
       
     findLonely(al);

    }
}
