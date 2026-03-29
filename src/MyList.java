import java.sql.SQLOutput;
import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(4));
        list.add(1,9);
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.clone());
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(5));
        System.out.println(list.iterator());
        System.out.println(list.remove(4));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
