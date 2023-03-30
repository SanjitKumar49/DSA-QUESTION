import java.util.ArrayList;
public class ArrayListComponents{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.remove(1));
    }
}