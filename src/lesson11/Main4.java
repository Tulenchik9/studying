package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        HashSet<Integer> b = new HashSet<>();
        b.add(8);
        b.add(9);
        b.add(10);
        b.add(11);
        b.add(12);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> union = utils.union(a, b);
        System.out.println(union);

        Collection<Integer> intersection = utils.intersection(a, b);
        System.out.println(intersection);

        Collection<Integer> unionWithoutDuplicate = utils.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate);

        Collection<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicate);

        Collection<Integer> difference = utils.difference(a, b);
        System.out.println(difference);
    }
}
