package de.schulung.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(234);
        numbers.add(765);
        numbers.add(34);
        numbers.add(78);
        numbers.add(3);
        numbers.add(22);
        numbers.add(0);

        System.out.println(numbers);
//        Collections.sort(numbers);
        Collections.sort(numbers, (o1, o2) -> o2.compareTo(o1));
        System.out.println(numbers);
    }
}
