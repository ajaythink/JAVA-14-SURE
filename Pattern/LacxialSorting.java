import java.util.*;

public class LacxialSorting{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Prince");
        list.add("Mohan");
        list.add("Modi");
        list.add("Anirudh");
        list.add("Vivek");
        list.add("Rudra");
        // Collections.sort(list);
        System.out.println(list);


        list.sort(new Comparator<String>(){
            @Override
            public int compare(String name1, String name2){
                return name1.compareTo(name1);
            }
        });
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}