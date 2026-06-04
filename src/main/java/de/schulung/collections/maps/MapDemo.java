package de.schulung.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> raumBelegung = new HashMap<>();

        raumBelegung.put(601, "Java OOP");
        raumBelegung.put(602, "Netzwerk Projekt");
        raumBelegung.put(603, "Schulung XY");

        Person t1 = new Person("Thorsten", 18);
        Person t2 = new Person("Isabell", 25);
        Person t3 = new Person("Daniel", 30);

//        Map<String, Set<Person>> kursBelegung = new HashMap<>();

//        Set<Person> s = new HashSet<>();
//        kursBelegung.put("Java OOP", s);
//        s.add(t1);
//
//        s = new HashSet<>();
//        kursBelegung.put("Netzwerk Projekt", s);
//        s.add(t2);
//
//        kursBelegung.get("Java OOP").add(t3);
//
//
//        System.out.println(kursBelegung);

        Kursverwaltung kv = new Kursverwaltung();

        kv.addPersonToClass("Java OOP", t1);
        kv.addPersonToClass("Netzwerk Projekt", t2);
        kv.addPersonToClass("Java OOP", t3);

//        kv.printClasses();
        kv.printGson();
    }
}
