import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicate1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(99);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(3);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>(list);
        
        System.out.println(set);
    }
}