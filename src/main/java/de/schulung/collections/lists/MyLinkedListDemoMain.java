package de.schulung.collections.lists;

public class MyLinkedListDemoMain {
    public static void main(String[] args) {
        MyLinkedList<String> myNames = new MyLinkedList<>();
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

        NumberList<Long> numberList = new NumberList<>();
        numberList.add(1L);
        numberList.add(2L);
        numberList.add(3L);
        numberList.add(4L);

        System.out.println(numberList.sum());
    }
}
