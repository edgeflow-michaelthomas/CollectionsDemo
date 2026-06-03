package de.schulung.collections;

public class MyNode {

    private String data;
    private MyNode next;
    private MyNode prev;

    public MyNode(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }
}
