package de.schulung.collections.generics;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public T removeContent() {
        T oldContent = this.content;
        this.content = null;
        return oldContent;
    }
}
