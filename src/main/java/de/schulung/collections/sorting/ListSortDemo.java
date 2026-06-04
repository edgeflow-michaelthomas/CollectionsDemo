package de.schulung.collections.sorting;

import de.schulung.collections.sets.Buch;

import java.util.ArrayList;
import java.util.List;

public class ListSortDemo {
    public static void main(String[] args) {
        List<Buch> books = new ArrayList<>();

        Buch b2 = new Buch("Buch2", 300, 2015);
        Buch b3 = new Buch("Buch1", 200, 1995);
        Buch b1 = new Buch("Buch1", 200, 1990);
        Buch b4 = new Buch("Anderes Buch", 200, 2000);

        books.add(b2);
        books.add(b3);
        books.add(b1);
        books.add(b4);

        System.out.println(books);

        books.sort((o1, o2) -> {
            int titleCompare = o1.getTitle().compareTo(o2.getTitle());
            int pagesCompare = Integer.compare(o1.getPages(), o2.getPages());
            int yearCompare = Integer.compare(o1.getYear(), o2.getYear());

            if (yearCompare != 0) {
                return yearCompare;
            }
            if (titleCompare != 0) {
                return titleCompare;
            }
            return pagesCompare;
        });

        System.out.println(books);
    }
}
