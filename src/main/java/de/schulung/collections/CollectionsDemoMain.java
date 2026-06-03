package de.schulung.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemoMain {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//
//        names.add("John");
//
//        int[] array = new int[5];
//        array[3] = 7;
//
//        List<Integer> intList = new ArrayList<>(100);
//
//        intList.add(7);
//        System.out.println(intList.get(60));


        MyLinkedList myNames = new MyLinkedList();
        myNames.add("John");
        myNames.add("Jane");

        System.out.println(myNames.get(1));

    }
}
