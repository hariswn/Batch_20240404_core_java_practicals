package core.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add(123);
//        list.add(12.42);
        list.add("java11");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("world");
//        System.out.println(list.size());
//        System.out.println(list.get(3));

        // for, while, do-while & for-each
        int size  = list.size();
//        for(int i = 0; i < size; i++) {
//            System.out.println(list.get(i));
//        }

//        for(String s : list) {
//            System.out.println(s);
//        }

        // iterator & list iterator

//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

//        ListIterator<String> litr = list.listIterator();
//        while(litr.hasNext()) {
//            System.out.println(litr.next());
//        }
    }
}
