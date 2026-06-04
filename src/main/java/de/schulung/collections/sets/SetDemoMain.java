package de.schulung.collections.sets;

import java.util.Set;
import java.util.TreeSet;

public class SetDemoMain {
    public static void main(String[] args) {
        Set<Buch> set = new TreeSet<>();

        Buch b1 = new Buch("Buch1", 200, 1990);
        Buch b2 = new Buch("Buch2", 300, 2015);
        Buch b3 = new Buch("Buch1", 200, 1995);
        Buch b4 = new Buch("Anderes Buch", 200, 1990);

        set.add(b2);
        set.add(b1);
        set.add(b3);
        set.add(b4);

//        System.out.println("b1.equals(b1) " + b1.equals(b1));
//        System.out.println("b1.equals(b2) " + b1.equals(b2));
//        System.out.println("b1.equals(b3) " + b1.equals(b3));
//        System.out.println("b1.equals(null) " + b1.equals(null));
//        System.out.println("b1.equals(\"Hello\") " + b1.equals("Hello"));
//        System.out.println("b3.equals(b1) " + b3.equals(b1));


        System.out.println(set);
        System.out.println(set.size());
    }
}
