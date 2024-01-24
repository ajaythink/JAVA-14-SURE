import java.util.*;

public class Slice{
    public static void main(String[] ag){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(9);
        System.out.println(list);
        List<Integer> sublist = new ArrayList<>();
        sublist = list.subList(1, 2);
        System.out.println(sublist);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(7);
        list1.add(9);

        list.addAll(1, list);
        System.out.println(list1);
    }
}