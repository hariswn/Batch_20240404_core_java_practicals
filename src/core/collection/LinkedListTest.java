package core.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("abc");
        ll.add("xyz");
        ll.add("iti");
        ll.add(5, "hhh");
        System.out.println(ll);

    }
}
