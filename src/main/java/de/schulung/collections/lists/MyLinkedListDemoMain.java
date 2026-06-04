package de.schulung.collections.lists;

public class MyLinkedListDemoMain {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Jane");
//
//        System.out.println(names.get(10));


        MyLinkedList myNames = new MyLinkedList();
        System.out.println(myNames.size());
        myNames.add("John");
        System.out.println(myNames.size());
        myNames.add("Jane");
        System.out.println(myNames.size());
        myNames.add("Jack");
        System.out.println(myNames.size());

        System.out.println(myNames.get(0));
        System.out.println(myNames.get(1));
        System.out.println(myNames.get(2));

        System.out.println(myNames.remove(1));
        System.out.println(myNames.size());
        System.out.println(myNames.get(0));
        System.out.println(myNames.get(1));

    }
}
