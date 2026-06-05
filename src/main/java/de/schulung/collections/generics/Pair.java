package de.schulung.collections.generics;

public class Pair<X, Y> {
    private X content1;
    private Y content2;

    public Pair(X content1, Y content2){
        this.content1 = content1;
        this.content2 = content2;
    }

    public void setFirst(X content1) {
        this.content1 = content1;
    }
    public void setSecond(Y content2) {
        this.content2 = content2;
    }

    public X getFirst() {
        return content1;
    }

    public Y getSecond() {
        return content2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + content1 +
                ", second=" + content2 +
                '}';
    }
}

/*
Die Box speichert nur einen Wert eines generischen Types.
Die Klasse Pair soll nun zwei Werte von unterschiedlichen generischen Typen speichern können.
getFirst
getSecond
 */
