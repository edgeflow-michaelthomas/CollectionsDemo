package de.schulung.collections.lists;


public class MyLinkedList {
    private MyNode head = null;
    private int size = 0;

    public void add(String data) {
        if (head == null) {
            head = new MyNode(data);
        } else {
            MyNode current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            MyNode newNode = new MyNode(data);
            current.setNext(newNode);
            newNode.setPrev(current);
        }

        size++;
    }

    public String remove(int index) {
        if ( index >= size || index < 0){
            return null;
        }

        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        String data = current.getData();

        MyNode prev = current.getPrev();
        MyNode next = current.getNext();

        if (prev != null) {
            prev.setNext(next);
        }

        if (next != null) {
            next.setPrev(prev);
            if (prev == null) {
                head = next;
            }
        }
        size--;

        return data;
    }

    public String get(int index) {
        MyNode current = head;

        if ( index >= size || index < 0){
            return null;
        }

        for (int i = 0; i < index; i++) {

            current = current.getNext();
        }

        return current.getData();
    }

    public int size() {
        return size;
    }
}
