package de.schulung.collections.sets;

import java.util.Objects;

public class Buch implements Comparable<Buch>{
    private String title;
    private int pages;
    private int year;

    public Buch(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buch b =  (Buch) o;
        return this.pages == b.pages && this.year == b.year && this.title.equals(b.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year,  pages, title);
    }

    @Override
    public int compareTo(Buch o) {
        int titleCompare = title.compareTo(o.title);
        int pagesCompare = Integer.compare(pages, o.pages);
        int yearCompare = Integer.compare(year, o.year);

        if (titleCompare != 0) {
            return titleCompare;
        }
        if (yearCompare != 0) {
            return yearCompare;
        }
        return pagesCompare;
    }
}
