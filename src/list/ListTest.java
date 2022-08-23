package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/8/2022
 * Time: 7:53 PM
 */
public class ListTest {
    public static void main(String[] args) {
//        int[] array = new int[10];
/*        List list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        list.add(3);
        System.out.println(list.size());
        list.add(5);
        list.add("dsaj");
        System.out.println(list.size());
        System.out.println(list);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list);*/

        // -----------------------------

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("1");
        System.out.println(strings);
        System.out.println(strings.size());
//        strings.remove(0);
//        strings.remove("1");
//        System.out.println(strings);
//        System.out.println(strings.size());

        List<String> stringList = Arrays.asList("A","B", "F");
//        strings.removeAll(stringList);
//        strings.addAll(stringList);
//        System.out.println(strings);
//        System.out.println(strings.size());

//        System.out.println(strings.contains("A"));

        System.out.println(strings.containsAll(stringList));

    }
}

/*
list.size() == array.length
Arrays.asList("A","B") Immutable
new ArrayList<>(Arrays.asList("A","B")) mutable
 */
