package de.schulung.collections.sets;

import java.util.Comparator;

public class BooksYearComparator implements Comparator<Buch> {

    @Override
    public int compare(Buch o1, Buch o2) {
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
    }
}
