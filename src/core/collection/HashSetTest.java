package core.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(4);
        set.add(8);
        set.add(2);
        set.add(4);
        set.add(7);
        set.add(2);
        set.add(10);
        System.out.println(set);

    }
}
