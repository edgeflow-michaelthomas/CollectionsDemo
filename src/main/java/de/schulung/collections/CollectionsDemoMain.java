package de.schulung.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemoMain {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Jane");
//
//        System.out.println(names.get(10));


        MyLinkedList myNames = new MyLinkedList();
        myNames.add("John");
        myNames.add("Jane");

//        System.out.println(myNames.get(10));
        System.out.println(myNames.size());
    }
}
