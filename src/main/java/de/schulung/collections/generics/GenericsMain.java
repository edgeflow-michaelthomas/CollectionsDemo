package de.schulung.collections.generics;

import de.schulung.collections.lists.MyNode;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.setContent("Hallo");
        System.out.println(box.getContent());
        printAnything("Hallo");
        printAnything(5);

        List<String>  list = new ArrayList<>();
        list.add("Hallo");
        list.add("Welt");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        String s = firstElement(list);

        System.out.println(sum(list2));
        printAnyList(list2);
        printAnyList(list);

        Pair<String, Integer> person = new Pair<>("Paul", 25);
        System.out.println(person);
    }

    public static <T> void printAnything(T o) {
        System.out.println(o);
    }

    public static <T> T firstElement(List<T> list) {
        return list.get(0);
    }

    // Bound wildcard: Hat einen Einschränkung des Typs, zb: <? extends Number>
    public static double sum(List<? extends Number> list) {
        double result = 0;

        for (Number number : list) {
            result += number.doubleValue();
        }

        return result;
    }

    // Unbound Wildcard: Kann ein komplett beliebiger Typ sein: <?>
    public static void printAnyList(List<?> anyList) {
        for  (Object o : anyList) {
            System.out.println(o);
        }
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> void swapList(List<T> list, int index1, int index2) {
        T value1 = list.get(index1);
        T value2 = list.get(index2);

        list.set(index1, value2);
        list.set(index2, value1);
    }
}
