package de.schulung.collections;


public class MyLinkedList {
    private MyNode head = null;

    public void add(String data) {
        if (head == null) {
            head = new MyNode(data);
        } else {
            MyNode current = head;

            while (current.getNext() != null){
                current = current.getNext();
            }

            MyNode newNode = new MyNode(data);
            current.setNext(newNode);
            newNode.setPrev(current);
        }
    }

    public String get(int index) {
        MyNode current = head;

        for (int i = 0; i < index; i++) {
            if ( current == null){
                return null;
            }
            current = current.getNext();
        }

        return current.getData();
    }

    public int size() {
        int size = 0;
        MyNode current = head;

        while (current != null){
            current = current.getNext();
            size++;
        }

        return size;
    }
}
